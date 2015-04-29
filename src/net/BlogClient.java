package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class BlogClient {
public static final String IP = "127.0.0.1";
public static final int PORT = 3026;

public static void main(String[] args)throws IOException{
	
	
	
	try(
			Socket blogSocket = new Socket(IP, PORT);
			 PrintWriter out =
				        new PrintWriter(blogSocket.getOutputStream(), true);
		     BufferedReader in =
				        new BufferedReader(
				            new InputStreamReader(blogSocket.getInputStream()));
				    BufferedReader stdIn =
				        new BufferedReader(
				            new InputStreamReader(System.in))
			
			){
		String userInput;
		while ((userInput = stdIn.readLine()) != null) {
		    out.println(userInput);
		    System.out.println("echo: " + in.readLine());
		}
		out.close();
		in.close();
		blogSocket.close();

	}
			
}

}
