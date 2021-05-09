package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fs  = new FileInputStream("E:\\www.YTS.AM.jpg");
		FileOutputStream fo = new FileOutputStream("E:\\copy.jpg");
		int x;
		while((x=fs.read())!=-1)
		{
			fo.write(x);
		}
		System.out.println("done");
	}

}
