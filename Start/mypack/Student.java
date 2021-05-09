package mypack;

public class Student implements Comparable<Student>  {

private int age;
private String name;
 Student(int age, String name){
	 this.age = age;
	 this.name = name;
 }
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(age == o.age)
	{
		return 0;
	}
	else if (age < o.age)
	{
		return -1;
	}
	else
	{
		return 1;
	}
		

	
}
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
 

}
