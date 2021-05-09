package mypack;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStudentChallenge {
public static void main(String[] args) throws Exception
{
	float [] f = {1.3f,1.2f,1.8f,10f};
	
	FileOutputStream fos = new FileOutputStream("F:\\file.txt");
	DataOutputStream dos = new DataOutputStream(fos);
	dos.writeInt(f.length);
	for(int i = 0;i<f.length;i++)
	{
		dos.writeFloat(f[i]);
		
	}
	System.out.println("Done");
	
	FileInputStream fis = new FileInputStream("F:\\file.txt");
	DataInputStream dis = new DataInputStream(fis);
	int count = dis.readInt();
	while(dis.available()>0)
	{
		float temp = dis.readFloat();
		System.out.println("Float "+" : "+temp);
	}
	
	OutputStream os = new FileOutputStream("F:\\file.txt");
	
	
	
	
	
	
	
	
}
}
