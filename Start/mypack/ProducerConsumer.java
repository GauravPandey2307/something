package mypack;

class MyData
{
int data;
boolean flag = true;
	synchronized public void set(int t)
	{
		while(flag!=true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		data=t;
		flag=false;
		notify();
	}
	synchronized public int get()
	{
		int x=0;
		while(flag!=false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		x= data;
		flag=true;
		notify();
		return x;
	}
}



class producer extends Thread{
	MyData p ;
	
	producer(MyData p)
	{
		this.p = p;
	}
	
	public void run()
	{
		int i = 0;
		while(true)
		{
			i++;
			System.out.println("Producer : "+i);
			p.set(i);
		}
		
		
		
	}
	
}

class Consumer extends Thread
{
	MyData p;
	Consumer(MyData p)
	{
		this.p = p;
	}
	
	public void run()
	{
		int x=0;
		while(true)
		{
		x=p.get();
		System.out.println("consumer : "+x);
		}
	}
	
	
}

class ProducerConsumer
{
	
	public static void main(String[] args) {
		MyData p = new MyData();
		producer p1 = new producer(p);
		Consumer c = new Consumer(p);
		p1.start();
		c.start();
	}
}