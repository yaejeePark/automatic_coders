import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
public class Client {

	public static void main(String[] args) throws Exception {
		try{
			/* Create client socket, connect to server */
			Socket c_socket = new Socket("127.0.0.1",6789);
			Scanner scan = new Scanner(System.in);
			/* Create output stream attached to socket */
			/* Create input stream attached to socket */
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(c_socket.getInputStream()));
			PrintWriter outToServer = new PrintWriter(c_socket.getOutputStream());
			//원래는 string임!! 
			int another_modifiedSentence = inFromUser.read();//서버한테서 온 것(Enter your destination station:)
			System.out.println(another_modifiedSentence+"나\n");
			/* read a expression from user. */
			String expression = scan.next();
			/* Send line to server */
			outToServer.println(expression + '\n');//서버에게 보냄!
			//outToServer.flush();
			//밑은 가천대 라고 나오는 것! 
			String re_modifiedSentence = inFromUser.readLine();//서버로 부터 온 것
			System.out.println(re_modifiedSentence+"\n");
			/* Read line from server */
			//modifiedSentence = inFromServer.readLine();
			//System.out.println("여기는 client !!! ->" + modifiedSentence);
			/* If client receives "finish" then close socket. 
			if (modifiedSentence.equalsIgnoreCase("FINISH")) {
				System.out.println(modifiedSentence);
				clientSocket.close();
				System.exit(1);
			}
			/*
			 * If client receives "Error" then print the modifiedSentence with
			 * error message.
			 
			else if (s[0].equalsIgnoreCase("Error")) {
				System.out.println(modifiedSentence);
			}
			
			 * If client give a correct compute information then print the
			 * modifiedSentence with result.
			 
			else
				System.out.println("Answer: " + modifiedSentence);
		*/
			c_socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
