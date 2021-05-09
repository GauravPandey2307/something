package mypack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {
public static void main(String[] args) {
 try(FileOutputStream fo = new FileOutputStream("F:\\Test.xls"))
 {
	 String s = "Duniya mc h";
	 byte b[]= s.getBytes();
	 fo.write(b);
	 System.out.println("Done");
 }
 catch(FileNotFoundException f)
 {
	 
 }
 catch(IOException e)
 {
	 
 }
}
}
