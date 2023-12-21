package Inheritance;

public class C extends B{

	public static void main(String[] args) {
		C c = new C();
		c.factory();
		c.house();
		
		c.car();
		
		System.out.println(c.family);
		System.out.println(c.grade);
		

	}

}
