/*
 * 3개 실행시 결과 값!

 *Created and started Thread = Thread-0

Created and started Thread = Thread-1

Created and started Thread = Thread-2

Client address and port = 127.0.0.1:52913
Thread = Thread-2
Exception =Connection reset

Client address and port = 127.0.0.1:52912
Thread = Thread-1
Exception =Connection reset

Client address and port = 127.0.0.1:52910
Thread = Thread-0
Exception =Connection reset
*/
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.io.*;
import java.text.*;
import java.util.ArrayList;
import java.io.*;
import java.lang.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
public class TCP_echo_server_thread {
	public static void main(String[] args) throws IOException{

	//	if(args.length != 1) //Test for correct # of args
		//	throw new IllegalArgumentException("Parameter(s) : <port>");
		
		//int echoServPort = Integer.parseInt(args[0]); //Server port *원래 책에 있었던 것!!
		
		//Create a server socket to accept client connection requests
		ServerSocket servSock = new ServerSocket(6789);
		//ServerSocket servSock = new ServerSocket(echoServPort);// *원래 책에 있었던 것!
	  //  ServerSocket servSock = new ServerSocket(6789);

		Logger logger = new ConsoleLogger(); //Log messages to console
		//ArrayList<String> seat_destination = new ArrayList<String>(7);
		Intro_loading intro_loading = new Intro_loading();
		System.out.println("Ready to server");
		//intro_loading();
		//Run forever, accepting and spawning threads to service each connection 
		for(;;){//들어오는 요구를 반복적으로 처리함/ 포트에 의해 만들어지는 accept를 호출!
			try{
			Socket ClntSock = servSock.accept(); //Block waiting for connection
			EchoProtocol protocol = new EchoProtocol(ClntSock, logger);
			Thread thread = new Thread(protocol);
			thread.start();
			logger.writeEntry("Created and started Thread = " + thread.getName());
			
			}catch(IOException e){
				logger.writeEntry("Exception = "+e.getMessage());
			}
		}
		/*Not reached*/
	}
}
