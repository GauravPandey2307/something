package mypack;
import java.net.*;
import java.io.*;
class Sender extends Thread
{
	Client c;
	Sender(Client c)
	{
		this.c= c;
	}
	public void run()
	{
		c.sendMessage();
	}
}
class Reciever extends Thread
{
	Client c;
	Reciever(Client c)
	{
		this.c = c;
	}
	public void run()
	{
		c.receiveMessage();
	}
}




public class Client extends Thread {
	Socket stk;
	BufferedReader sr;
	PrintStream pr;
	BufferedReader br;
	String s;
	Client()
	{
		try {
			stk = new Socket("localhost",2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sr = new BufferedReader(new InputStreamReader(stk.getInputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr = new PrintStream(stk.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void sendMessage()
		{
			try {
				System.out.println("enter message");
				
				s = br.readLine();
				System.out.println("sending");
				pr.println(s);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void receiveMessage()
		{
			try {
				String s1 = sr.readLine();
				System.out.println("server sent : "+s1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	

public static void main(String[] args) throws Exception{
	
	
	
	Client c = new Client();
	Sender s = new Sender(c);
	Reciever r = new Reciever(c);
	while(true)
	{
		s.start();
		r.start();
	}
	
	
}
}
