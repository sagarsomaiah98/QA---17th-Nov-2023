package SetConcepts;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
	//set doesnt store duplicate values
		
		Set<String> colors = new HashSet<String>();
		colors.add("blue");
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("white");
		colors.add("black");
		colors.add("blue");
	//	colors.add("Red");
		colors.add("green");
		
		System.out.println(colors.size());
		
	//	System.out.println(Color.getColor(2)); set doesnt store based on index
		
		Iterator<String> pointer=colors.iterator();
		
		/*
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 */
		System.out.println("********************");
		
		
		while(pointer.hasNext()) {
			
			System.out.println(pointer.next());
		}
		

	}

}
