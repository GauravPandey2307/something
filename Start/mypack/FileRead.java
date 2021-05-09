package mypack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
public static void main(String[] args) {
	File file  = new File("F:\\Test.txt");
	try(FileReader f = new FileReader(file))
	{
		int x;
		while((x=f.read())!=-1)
		System.out.print((char)x);
		
		
	}
	catch(FileNotFoundException f)
	{
		
	}
	catch(IOException e)
	{
		
		
	}
	System.out.println();
	
	try {
		Scanner sf = new Scanner(file);
		System.out.println(sf.nextLine());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
