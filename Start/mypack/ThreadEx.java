package mypack;

class Thread1 extends Thread
{
	private int id;
	Thread1(int i)
	{
		this.id=i;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	void display()
	{
		for(int i = 0 ; i<5;i++)
		{
			System.out.println("Id : "+this.id+" number : "+i);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
		
	}
	
	
	
}
public class ThreadEx {

	public static void main(String[] args) {
		Thread t = new Thread1(1);
		Thread t2 = new Thread1(2);
	t.start();
	t2.start();
	}
}
