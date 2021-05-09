package mypack;

interface lamb2 
{
	public void display(String string);
}
public class Lambda2 {

	void display(String s )
	{
		System.out.print(s);
	}
	public static void main(String[] args) {
		lamb2 m = System.out::println;
		m.display("hello");
	}
}
