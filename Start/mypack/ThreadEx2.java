package mypack;

public class ThreadEx2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while(true)
		{
			System.out.println(i+" hello ");
			i++;
		}
	}

	public static void main(String[] args) {
		ThreadEx2 my = new ThreadEx2();
		my.start();
		while(true)
		{
			System.out.println("world");
		}
		
		
	}

}
