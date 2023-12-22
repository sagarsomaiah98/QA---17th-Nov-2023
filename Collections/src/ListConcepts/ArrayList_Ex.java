package ListConcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	//arraylist is dynamic in nature, to size required
	
	public static void main(String[] args) {
		List<String> students= new ArrayList<String>();
		students.add("Mark");
		students.add("Lee");
		students.add("Joe");
		
		System.out.println(students.size());
		students.add("Robert");
		students.add("Bruce");
		System.out.println(students.size());
		
	//	System.out.println(students.get(5));
		
		for(int i=0;i<students.size();i++) {
			
			System.out.println(students.get(i));
		}

	}

}
