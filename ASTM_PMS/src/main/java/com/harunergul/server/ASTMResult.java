package com.harunergul.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ASTMResult {

	public static void main(String... args) {
		int PORT = 20031;
		ExecutorService executor = Executors.newFixedThreadPool(4);
		ServerSocket serverConnect = null;

		try {
			serverConnect = new ServerSocket(PORT);
			
			while(true) {
				ASTMResultHandler worker = new ASTMResultHandler(serverConnect.accept());
				executor.execute(worker);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
