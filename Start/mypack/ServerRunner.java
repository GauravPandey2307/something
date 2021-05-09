package mypack;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerRunner {
	
	public  ArrayList<Server> list;
	ServerRunner()
	{
		list = new ArrayList<Server>();
	}
	public static void main(String args[])
	{
		

		try
		{
		ServerSocket ss = new ServerSocket(2000);
		String name;
		ServerRunner runner  =  new ServerRunner();
		
		
		Socket stk;
		Server server;
		while(true)
		{
			stk = ss.accept();	
			
			server  = new Server(stk,runner);
			runner.list.add(server);
			
			server.start();
		}
	}
	catch(Exception e){}




}
}
