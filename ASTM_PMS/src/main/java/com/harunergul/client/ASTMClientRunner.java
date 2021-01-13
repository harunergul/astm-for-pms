package com.harunergul.client;

/**
 * 
 * @author Harun ERGUL
 * @date Jan 13, 2021
 */
public class ASTMClientRunner {

	public static void main(String[] args) {

		String IP = "92.61.0.11";
		Integer PORT = 20030;

		ASTMClientHandler handler = new ASTMClientHandler(IP, PORT);
		Thread thread = new Thread(handler);
		thread.start();

	}

}
