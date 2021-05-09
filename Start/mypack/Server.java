package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class Server extends Thread
{
	Socket stk;
	String name;
	ServerRunner runner;
	BufferedReader br;
	PrintStream pr; 
	
	
	Server(Socket stk,ServerRunner runner)
	{
		this.stk = stk;
		this.runner = runner;
		try {
			br=  new BufferedReader(new InputStreamReader(this.stk.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pr=new PrintStream(this.stk.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	synchronized public void sendMessage(String s )
	{
		this.pr.println(s);
	}
	public void run()
	{
		try
		{
			
		String s ;
		StringBuilder sr;
		System.out.println("Server connected : Enter name");
		this.name= br.readLine();
		
		do
		{
			
			s=br.readLine();

			sr = new StringBuilder(s);
			sr.reverse();
			s= sr.toString();
			if(s.equals("dne"))
			{
				runner.list.remove(this);
			}
			String name1 = this.name;
			for(int i = 0 ; i<runner.list.size();i++)
			{
				runner.list.get(i).sendMessage(name1+"Sent : "+s);
			}

			
		}while(!s.equals("dne"));
		
		stk.close();
	}
	catch(Exception e)
	{
		System.out.println("Exeception occured : "+e);
	}

	



	}
}

