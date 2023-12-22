package ListConcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<String> students= new ArrayList<String>();
		students.add("Mark");
		students.add("Lee");
		students.add("Joe");
		
		List<String> students1= new ArrayList<String>();
		students1.add("Kevin");
		students1.add("George");
		students1.add("Henry");

		System.out.println(students.size());
		students.addAll(students1);//copy from one arraylist to another
		
		System.out.println(students.size());
		
		
		
	}

}
