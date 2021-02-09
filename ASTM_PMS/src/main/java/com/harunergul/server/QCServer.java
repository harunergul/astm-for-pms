package com.harunergul.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import com.harunergul.utils.Codec;
import com.harunergul.utils.Constants;

/**
 * 
 * @author Harun ERGUL
 * @date Feb 9, 2021
 */
public class QCServer implements Runnable {

	int BUFFER_LEN = 2048;
	private Codec codec = new Codec();
	private int port;
	private IAstmHandler astmHandler;

	public QCServer(int port, IAstmHandler astmHandler) {
		this.port = port;
		this.astmHandler = astmHandler;
	}

	public void run() {

		ServerSocket listenerSocket = null;
		try {

			listenerSocket = new ServerSocket(port);

		} catch (IOException e) {

		}
	}

	class Handler implements Runnable {

		private Socket clientSocket;

		public Handler(Socket socket) {
			this.clientSocket = socket;
		}

		public void run() {
			InputStream inputStream;
			OutputStream outputStream;

			try {
				inputStream = clientSocket.getInputStream();
				outputStream = clientSocket.getOutputStream();

				byte[] buffer = new byte[BUFFER_LEN];

				ArrayList<ByteBuffer> frameBuffers = new ArrayList<ByteBuffer>();

				while (!clientSocket.isClosed()) {
					int numberOfBytesReaded = inputStream.read(buffer);
					if (numberOfBytesReaded > 0) {
						for (int i = 0; i < numberOfBytesReaded; i++) {
							byte receivedChar = buffer[i];

							if (receivedChar == Constants.ENQ) { // indicates new message request, clear old data and
																	// send ACK message in response
								outputStream.write(Constants.ACK);
								frameBuffers.clear();
							} else if (receivedChar == Constants.EOT) { // Message is ended, send ACK and process
																		// received data
								outputStream.write(Constants.ACK);
								processMessage(frameBuffers);
								frameBuffers.clear();
							} else if (receivedChar == Constants.STX) {
								ByteBuffer byteBuffer = ByteBuffer.allocate(2000); // We keep capacity of out byte
																					// buffer big enough.
								byteBuffer.put(receivedChar);
								frameBuffers.add(byteBuffer);
							} else if (receivedChar == Constants.LF) {
								if (frameBuffers.size() > 0) {
									ByteBuffer bufferedFrame = frameBuffers.get(frameBuffers.size() - 1);
									bufferedFrame.put(receivedChar);
									outputStream.write(Constants.ACK);
								}
							} else {
								if (frameBuffers.size() > 0) {
									ByteBuffer bufferedFrame = frameBuffers.get(frameBuffers.size() - 1);
									bufferedFrame.put(receivedChar);
								}
							}
						}
					}

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		private void processMessage(ArrayList<ByteBuffer> frameBuffers) {
			ArrayList<StringBuilder> messageFrames = new ArrayList<StringBuilder>();
			boolean isPreviousETB = false;
			boolean appendMode = false;
			for (ByteBuffer byteBuffer : frameBuffers) {
				byteBuffer.flip();
				while (byteBuffer.hasRemaining()) {

					byte ch = byteBuffer.get();
					if (ch == Constants.STX && isPreviousETB) {
						appendMode = true;
						isPreviousETB = false;
					} else if (ch == Constants.STX) {
						StringBuilder frameHolder = new StringBuilder();
						messageFrames.add(frameHolder);
						appendMode = true;

					} else if (ch == Constants.ETB) {
						appendMode=false;
						isPreviousETB = true;
					} else if (ch == Constants.CR || ch == Constants.ETX || ch == Constants.LF) {
						appendMode = false;
					} else {

						
						if (appendMode && messageFrames.size() > 0) {
							StringBuilder frameHolder = messageFrames.get(messageFrames.size() - 1);
							frameHolder.append((char) ch);
						}
					}

				}
			}
			
			StringBuilder allMessage = new StringBuilder();
			
			for (StringBuilder messageFrame : messageFrames) {
				allMessage.append(messageFrame.toString());
				allMessage.append("\n");
			}
			
			astmHandler.handle(allMessage.toString());

		}

	}

}
