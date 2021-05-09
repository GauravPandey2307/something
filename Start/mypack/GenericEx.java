package mypack;

import java.util.ArrayList;
import java.util.List;

class Animal{
	void running() {
		
	}
}
class Dog extends Animal 
{
	private String name;
	Dog(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	void running()
	{
		System.out.println("dog is running");
	}
	
	
}
class Pillow
{
	
	void active()
	{
		System.out.println("dead");
	}
}

public class GenericEx<T extends Animal> {

	List<T> a;
	GenericEx(T t)
	{
		a = new ArrayList<>();
		a.add(t);
	}
	
	void display()
	{
		for(T t : a)
		{
			System.out.println(t);
		}
	}
	
	public static void main(String args[])
	{
		Dog d = new Dog("Lab");
		Pillow p = new Pillow();
		//GenericEx<Pillow> a1 = new GenericEx<Pillow>(p);
		GenericEx<Dog> a1 = new GenericEx<Dog>(d);
		a1.display();
	}
	
}
