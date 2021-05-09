package mypack; 

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator>{
	
		
	

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if(o1.age == o2.age)
		{
			return 0;
		}
		else if (o1.age < o2.age)
		{
			return -1;
		}
		else
		{
			return 1;
		}
			
	}

}
