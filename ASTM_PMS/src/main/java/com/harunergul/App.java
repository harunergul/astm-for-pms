package com.harunergul;

import com.harunergul.server.IAstmHandler;
import com.harunergul.server.QCServer;

public class App {
	
	public static void main(String[] args) {
		int QC_PORT = 20032;

		IAstmHandler handler = new IAstmHandler() {

			public void handle(String message) {

				System.out.println(message);//complete ASTM message
			}
		};

		QCServer server = new QCServer(QC_PORT, handler);
		Thread thread = new Thread(server);
		thread.start();
	}
	
}
