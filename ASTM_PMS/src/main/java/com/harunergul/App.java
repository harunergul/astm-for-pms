package com.harunergul;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.harunergul.server.IAstmHandler;
import com.harunergul.server.QCServer;

public class App {
	
	public static void main(String[] args) {
		
//		Helper helper = new Helper();
//		
//		ArrayList<String> message = helper.rerunOrder();
//		
//		for (String string : message) {
//			//System.out.println(string);
//		}
//		
//		String abc="5R|2|^^^992^^^^M_RUTIN_1^^^^^ASY|6|||||F||||20210215164647|M_RUTIN_1";
//		
//		String [] value= abc.split("\\|");	
//		System.out.println(value[2]);
//		String result = value[2];
//		String[] subMessage = result.split("\\^");
//		System.out.println(subMessage[3]);
//		
//		
//		String str = "jå∫∆avµa2bl√øog";
//        System.out.println("Before removing non ASCII characters:");
//        System.out.println(str);
//        System.out.println("------------------------------------");
//        // Using regular expressions to remove non ascii characters
//        str = str.replaceAll("[^\\p{ASCII}]", "");
//        System.out.println("After removing non ASCII characters:");
//        System.out.println(str);
		
		
		
		MainApp app = new MainApp(); //Frame cerceve
		
		
		
		
		
		JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        app.add(panel);  
        app.setSize(200, 300);  
        app.setLocationRelativeTo(null);  
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        app.setVisible(true);  
	}
	
}
