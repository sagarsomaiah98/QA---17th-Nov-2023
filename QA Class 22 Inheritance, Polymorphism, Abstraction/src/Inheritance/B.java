package Inheritance;

public class B extends A {
	
	public void car() {
		System.out.println("Car belongs to B");
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.car();
		b.factory();
		b.house();
		System.out.println(b.grade);
		System.out.println(b.family);
	}

}
