import java.net.*;
import java.util.Scanner;
import java.io.*;

public class TCPEchoClient {

	public static void main(String[] args) throws IOException {
		try{
			/* Create client socket, connect to server */
			Socket c_socket = new Socket("127.0.0.1",6789);
			Scanner scan = new Scanner(System.in);
			/* Create output stream attached to socket */
			/* Create input stream attached to socket */
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(c_socket.getInputStream()));
			PrintWriter outToServer = new PrintWriter(c_socket.getOutputStream());
			Show_seat show_seat = new Show_seat();
			//String modifiedSentence = inFromUser.readLine();//�������׼� �� ��(���� �ð�)
			//System.out.print(modifiedSentence+"\n");
			//���� �غ��� ����
			//String another_modifiedSentence = inFromUser.readLine();//�������׼� �� ��(Enter your destination station:)
			//System.out.print(another_modifiedSentence+"\n");
			/* read a expression from user. */
			//String expression = scan.next();
			/* Send line to server */
			//outToServer.println(expression + '\n');//�������� ����!
			//outToServer.flush();
			//���� ��õ�� ��� ������ ��! 
			String re_modifiedSentence = inFromUser.readLine();//������ ���� �� ��
			System.out.println(re_modifiedSentence+"\n");
			/* Read line from server */
			//modifiedSentence = inFromServer.readLine();
			//System.out.println("����� client !!! ->" + modifiedSentence);
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
