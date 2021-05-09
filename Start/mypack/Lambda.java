package mypack;

interface lamb
{
	int display();
}
public class Lambda {
	public static void main(String[] args) {
		int j =0;
		lamb m  = ()->
		{ int i = 0;
			System.out.println("lambda working : "+ (++i)+" "+j);
			return i;
		};
		
		m.display();
	}
}
