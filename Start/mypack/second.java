package mypack;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class second
{
	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar();
		System.out.println(c.getTime());
		Date str = c.getTime();
		String s = str.toString();
		String[] s1 = s.split(" ");
		for(String a : s1)
		{
			System.out.println(a);
		}
		
	}
	
	
}