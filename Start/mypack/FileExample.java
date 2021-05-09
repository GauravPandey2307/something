package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileExample  {
public static void main(String[] args) throws Exception
{
	/*FileWriter f = new FileWriter("F:\\FileWriter.txt");
	String s = "gaurav";
	int i =10;
	f.write(i);
			System.out.println("dine");
			f.close();
	*/
	File file = new File("F:\\Output.txt");
	FileOutputStream f = new FileOutputStream(file);
	String s = "sweta";
	byte[] b = s.getBytes(); 
	f.write(b);
	int i=100;
	byte i1 = (byte)i;
	f.write(i1);
	
	FileInputStream fis = new FileInputStream(file);
	int x;
	while((x=fis.read())!=-1)
	{
		System.out.println(x);}
	
	
	System.out.println(System.currentTimeMillis());
	
	
	
	
	
	
	
	
}
}
