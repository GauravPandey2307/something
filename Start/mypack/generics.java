package mypack;

import java.util.ArrayList;
import java.util.List;

class Generic<T>{
	
	T object ;
	//List<E> list;

	public Generic(T object) {
		this.object = object;
	} 
	
	public  T getObj()
	{
		
		return object;
	 
	}
	public  void displ(List<T> l)
	{
		for(T e : l)
		{
			System.out.println(e);
		}
	}
	
	
	
}
/*Use bounded parameters of generics to apply restrictions example if we want a class of only 
 * number to use generic class the in the diamond operator use extends keyword eg :
 *  <N extends Number>*/
public class generics {
	public static void main(String args[])
	{
		Generic<String> s = new Generic<String>("hello");
		System.out.print(s.getObj());
		List<String> s1 = new ArrayList<>();
		s1.add("Hel");
		s1.add("sad");
		s1.add("gp");
		s.displ(s1);
	}
	

}
