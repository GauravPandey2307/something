package mypack;

class Upper 
{
	private int a;
	Upper(int a)
	{
		this.a = a ;
	}
	
	
}
class Lower extends Upper
{
	Lower(int i)
	{
		super(i);
	}
}

public class UpCastingAndDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Upper u  = new Upper(10);
		Lower i = new Lower(10);
		Upper a = new Lower(1);
		Lower z = (Lower)new Upper(11);
		

	}

}
