package mypack;

class OverFlow extends Exception
{

	@Override
	public String toString() {
		return "Overflow exception";
	
}
}

class UnderFlow extends Exception
{
	@Override
	public String toString() {
		return "Underflow exception";
	
}	
}

public class StackException {
	public static int p = -1;
	
	private int size;
	int arr[];
	StackException(int size)
	{
		this.size = size;
		arr = new int[size];
	}
	public void addEle(int data) throws OverFlow
	{
		if(p==-1)
		{
			p++;
			arr[p]=data;
		}
		else
		{
			p++;
			if(p>(arr.length-1))
			{
				throw new OverFlow();
			}
			arr[p]=data;
		}
		
		
	}
	
	
	public void deleteLEle() throws UnderFlow
	{
		if(p==-1)
		{
			throw new UnderFlow();
			
		}
		else
		{
			p--;
		}
	}
	
	void printStack()
	{
		for(int i = 0; i<=p;i++)
		{
			System.out.println("ele : " + arr[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		StackException s =new StackException(5);
		try {
		s.addEle(1);
		s.addEle(2);
		s.addEle(10);
		s.printStack();
		s.deleteLEle();
		s.deleteLEle();
		s.deleteLEle();
		s.deleteLEle();
		}
		catch(UnderFlow e)
		{
			System.out.println(e);
		}
		
		catch(OverFlow e)
		{
			System.out.println(e);
		}
	}
	
	
	

	}


