package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparabke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentComparator> a = new  ArrayList<>();
		a.add(new StudentComparator(13,"gaurav"));
		a.add(new StudentComparator(24,"guddu"));
		a.add(new StudentComparator(2,"lunth"));
		System.out.println(a);
		Collections.sort(a,new AgeComparator());
		System.out.println("after" + a);
	}

	/*For comparator let the class like student be as it is and dont do anything in it
	 *  create a new class like agecomparator and implement comparator interface in it
	 *  use <NameOfobjectClass> in diamond and override compare method according to your needs
	 *  in collection.sort(listname,new NameOfNewclass()) the object will be of the class implementing
	 *  the comparator
	 */
	/*for comparable simply implement comparable interface and in diamond class name of the
	 * 
	 * class implementing it
	 * override compareto method
	 * 
	 * 
	 */
}
