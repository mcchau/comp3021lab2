package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BlogServer{ 
	public static final String IP = "127.0.0.1";
	public static final int PORT = 3026;
	
	public static void main(String[] args)throws IOException{

	try(
			ServerSocket serverSocket = new ServerSocket(PORT);
			Socket clientSocker = serverSocket.accept();
			BufferedReader in =
			        new BufferedReader(
			            new InputStreamReader(clientSocker.getInputStream()));
			
			){
		String userInput;
		while ((userInput = in.readLine()) != null) {
		    System.out.println(userInput);
		}
		in.close();
		clientSocker.close();
		serverSocket.close();
	}

}
}
