package mypack;

class Threader extends Thread
{
	public Synchronized s;
	String s1;
	
	Threader(Synchronized d,String s1)
	{
		this.s = d;
		this.s1=s1;
	}
	@Override
	public void run()
	{
		s.display(s1);
	}
	
}
class Threader2 extends Thread
{
	public Synchronized s;
	String s1;
	
	Threader2(Synchronized d,String s1)
	{
		this.s = d;
		this.s1=s1;
	}
	@Override
	public void run()
	{
		s.display(s1);
	}
	
}


public class Synchronized {
	final int a = 0;
	
	
	synchronized void display(String s) {
		
		for(int i = 0 ; i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Synchronized s = new Synchronized();
		Threader t = new Threader(s,"hello world");
		Threader t2 = new Threader(s,"Hello Universe");
		//Threader2 t2 = new Threader2(s,"Hello Universe");
		t.start();
		
		t2.start();
		
	}

}
