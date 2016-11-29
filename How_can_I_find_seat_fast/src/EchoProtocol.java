import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.net.Socket;
import java.net.ServerSocket;
//import java.io.IOException;
public class EchoProtocol implements Runnable{
	static public final int BUFSIZE = 32 ; //Size (in bytes) of I/O buffer
	
	private Socket clntSock; //Connection socket
	private Logger logger; //Logging facility
	int num = 0;
	
	public EchoProtocol(Socket clntSock, Logger logger){
		this.clntSock = clntSock;
		this.logger = logger;
	}
	
	public void run(){//run!!!! 
	      try{
	   	   String clientSentence;
	        
	   	   
	         /*Create welcoming socket at port 6789*/
	         /*서브소켓생성(지정자에 의해 지정된 포트에서 연결 요구 유무 Query)*/
	         //ServerSocket s_socket = new ServerSocket(6789);
	         //System.out.println("Server start..\n ");
	      
	         
	        while(true) { 
	        	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clntSock.getInputStream()));
	            PrintWriter outToServer = new PrintWriter(clntSock.getOutputStream(), true);
	            
	        	Person person = new Person();
				set다 해라 ~ 
				
	   		/*Create input stream, attached to socket*/
	           
	           /* 내가 가져간다.
	            * GetCurrentTimeExam currentTime = new GetCurrentTimeExam();//Time 받는 부분
	            String currentTimeStr = currentTime.GetCurrentTimeExam();
	            outToServer.println("current time is "+currentTimeStr);//여기까지는 잘 돼 !!! 

	    		 System.out.println("Current Time : "+currentTimeStr);
	            outToServer.println("current time is "+currentTimeStr);*/
	            
	           // GiveCurrentSubwayPosition findSubwayPosition = new GiveCurrentSubwayPosition(currentTimeStr);//Time 받는 부분
	            //System.out.println(""+findSubwayPosition.getmm()+" "+findSubwayPosition.getss());
	            // System.out.println(FindSubwayPosition.GiveCurrentSubwayPosition(currentTimeStr));
	           // System.out.println("현재 mm과 ss는???? "+FindSubwayPosition); 
	            //String sendDataString = "Enter your destination station: ";
	    		// System.out.print(sendDataString);
	            //outToServer.println(sendDataString+'\n');//클라이언트에게 보내는 부분

	            /*Read in line from socket*/
	            //clientSentence = inFromClient.readLine();//client로 부터 받은 부분
	           // SeatInformation seatInfrom = new SeatInformation(clientSentence);
	            //System.out.println(clientSentence+"\n");//가천대 라고 쓴 부분을 서버에서 출력해봣
	            outToServer.println(currnet_seat.get_current_seat());//가천대라고 쓴 부분을 보내!  
	             
	            /* String s[] = clientSentence.split(" ");
	            if(s.length < 3)
	            {
	               /*If sentence is finish then return "FISISH" word
	               if(clientSentence.equalsIgnoreCase("finish"))
	               {
	                  System.out.println("FROM CLIENT: "+ clientSentence);
	                  String finish =""+"finish"+'\n';
	                  outToClient.writeBytes(finish);
	               }
	               /*If the number of argument is too small then return Error message
	               else
	               {
	                  System.out.println("Incorrect : Too small arguments");
	                  outToClient.writeBytes("Error message: Too small arguments"+'\n');
	               }
	            }
	            /*If the number of argument is too big then return Error message
	            else if(s.length > 3)
	            {
	               System.out.println("Incorrect : Too many arguments");
	               outToClient.writeBytes("Error message: Too many arguments"+'\n');
	            }
	            /*Compute the number received sentence from client*/
	            /*else{
	               switch(s[0]){
	                  case "ADD":
	                     result = Integer.parseInt(s[1])+Integer.parseInt(s[2]);
	                     System.out.println(s[1]+" + "+s[2]+" = "+result);
	                     outToClient.writeBytes(""+result+'\n');
	                     break;
	                  case "MINUS":
	                     result = Integer.parseInt(s[1])-Integer.parseInt(s[2]);
	                     System.out.println(s[1]+" - "+s[2]+" = "+result);
	                     outToClient.writeBytes(""+result+'\n');
	                     break;
	                  case "MULTIPLE":
	                     result = Integer.parseInt(s[1])*Integer.parseInt(s[2]);
	                     System.out.println(s[1]+" * "+s[2]+" = "+result);
	                     outToClient.writeBytes(""+result+'\n');
	                     break;
	                  case "DIV":
	                     /*If the division number is 0 then return Error message
	               	   if(s[1].equalsIgnoreCase("0")||s[2].equalsIgnoreCase("0"))
	                      {
	                         System.out.println("Incorrect : Divided by zero");
	                         outToClient.writeBytes("Error message: Divided by zero"+'\n');
	                      }
	                      else{
	                         result = (int)Integer.parseInt(s[1])/Integer.parseInt(s[2]);
	                         System.out.println(s[1]+" / "+s[2]+" = "+result);
	                         outToClient.writeBytes(""+result+'\n');
	                      }
	                     break;
	                  default:
	                     System.out.println("Incorrect : Invalid expression");
	                     outToClient.writeBytes("Error message: Invalid expression"+'\n');
	                     break;
	               }
	               */ 
	        //s_socket.close();
	        clntSock.close();
	        }
	         }catch(IOException e){
	       	  e.printStackTrace();
	         }
	}
}
