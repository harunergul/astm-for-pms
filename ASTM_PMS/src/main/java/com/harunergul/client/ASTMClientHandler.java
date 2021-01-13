package com.harunergul.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.harunergul.Helper;
import com.harunergul.utils.Constants;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 13, 2021
 */
public class ASTMClientHandler implements Runnable {

	private String IP;
	private Integer PORT;

	public ASTMClientHandler(String IP, Integer PORT) {
		this.IP = IP;
		this.PORT = PORT;
	}

	public void run() {
		Socket clientSocket = null;
		boolean isSocketUp = false;

		while (true) {
			if (clientSocket == null) {

				try {
					clientSocket = new Socket(IP, PORT);
					isSocketUp = true;
					System.out.println("Connected to Roche....");
					clientSocket.setSoTimeout(1000);
				} catch (SocketException e) {
					isSocketUp = false;
					e.printStackTrace();
					retry();
				} catch (UnknownHostException e) {
					isSocketUp = false;
					clientSocket = null;
					e.printStackTrace();
					retry();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			if (isSocketUp) {
				try {
					makeRequest(clientSocket);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	private void retry() {
		try {
			System.out.println("5 second later reattempt to connect Roche LIS ...");
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	private void makeRequest(Socket clientSocket) throws IOException, InterruptedException {
		OutputStream outputStream = clientSocket.getOutputStream();
		ArrayList<String> orderMessage = getOrderMessage();
		StringBuilder build = new StringBuilder();
		int frameNumber = 1;
		for (String messageLine : orderMessage) {
			messageLine = frameNumber + messageLine;
			frameNumber++;
			String checksum = calculate_checksum(messageLine + Constants.ETX);

			build.append(Constants.STX + messageLine + Constants.ETX + checksum + System.lineSeparator());
		}

		String message = build.toString();
		System.out.println(message);

		message = Constants.ENQ + message + Constants.EOT;
		if (message != null) {
			sendToSocket(outputStream, message);
		}

	}

	public static String calculate_checksum(String value) {
		if (value == null) {
			return "-1";
		}
		int total = 0;
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			total += (int) (c);
		}
		String newValue = Integer.toHexString(total).toUpperCase();
		if (newValue.length() > 2) {
			newValue = newValue.substring(newValue.length() - 2);
		}
		return newValue;
	}

	private ArrayList<String> getOrderMessage() throws InterruptedException {

		Helper helper = new Helper();
		return helper.createOrder();
		// return helper.deleteOrder();
//		return helper.rerunOrder();

//		return helper.rerunDilutionOrder();

	}

	private void sendToSocket(OutputStream outputStream, String message) {
		try {
			outputStream.write(message.toString().getBytes(), 0, message.toString().getBytes().length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String... args) {

		System.out.println(ASTMClientHandler.calculate_checksum("1Test" + Constants.ETX));
		System.out.println(ASTMClientHandler.calculate_checksum("6L|1|N" + Constants.ETX));

	}

}
