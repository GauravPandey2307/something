package mypack;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.InputMismatchException;


public class Comp implements Runnable,Test{
public static void main(String args[])
{
	//Thread first = new hello();
	//Thread second = new second();
	Thread comp = new Thread(new Comp());
//	first.start();
	//second.start();
	System.out.println("main");
	comp.start();
	System.out.println("The current thread is : "+Thread.currentThread().getName());
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("comp thread");
	
}

@Override
public void starting() {
	// TODO Auto-generated method stub
	
}

@Override
public void ending() {
	// TODO Auto-generated method stub
	
}


}