package MethodOverloading;

public class Overloading {
	
	public void method() {
		
		System.out.println("method without arguments");
	}
	
	
	public void method(int a) {
		
		System.out.println("method with integer arguments");
	}
public void method(int a, double b) {
		
		System.out.println("method with integer & double arguments");
	}
public void method(double a, double b) {
	
	System.out.println("method with double arguments");
}
public void method(char a) {
	
	System.out.println("method with char arguments");
}
public void method(String a,char b) {
	
	System.out.println("method with string & char arguments");
}
public void method(int a, int b, int c) {
	
	System.out.println("method with 3 integer arguments");
}

	public static void main(String[] args) {
		
		Overloading o= new Overloading();
		o.method(20);
		o.method(23,22,52);
		o.method("henry", 'J');
		o.method(5.2,6.3);
		
		
		
	}

}
