package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStudentChallenge {
	
	
public static void main(String[] args) {
	
	
	File file = new File("F:\\Test.txt");
	try(FileReader fr = new FileReader(file);FileWriter fw  = new FileWriter("F:\\Test2.txt"))
	{
		int x;
		while((x=fr.read())!=-1)
		{
			
			fw.write(x);
		}
		String s = "asadas";
		fw.write(s);
		
		System.out.println("done");
		
	}
	catch(IOException e)
	{
		System.out.println("Wrong file"+e);
	}
	
	try {
		//FileOutputStream fs = new FileOutputStream("F:\\new.txt");
		String s = "sadasaf";
		//fs.write(s.getBytes());
		
		FileInputStream fi = new FileInputStream("F:\\new.txt");
		System.out.println((int)fi.read());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
