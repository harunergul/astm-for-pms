package com.harunergul.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import com.harunergul.utils.Constants;

public class ASTMResultHandler implements Runnable {

	private Socket clientSocket;

	public ASTMResultHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
		// TODO Auto-generated constructor stub
	}

	public void run() {

		InputStream input = null;
		OutputStream output = null;
		try {
			input = clientSocket.getInputStream();
			output = clientSocket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (input != null) {
			try {
				String message = getFromSocket(input);
				System.out.println(message);
				 
				
				output.write(Constants.ACK);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub

	}

	private String getFromSocket(InputStream input) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		StringBuilder requestString = new StringBuilder();
		String strCurrentLine = "";

		while ((strCurrentLine = in.readLine()) != null) {
			System.out.println(strCurrentLine);
			requestString.append(strCurrentLine);
//			if (strCurrentLine.contains("</soap:Envelope>"))
//				break;
		}
		System.out.println(requestString);

		return requestString.toString();
	}

}
