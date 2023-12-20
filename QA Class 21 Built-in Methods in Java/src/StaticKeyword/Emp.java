package StaticKeyword;

public class Emp {
	//using static keyword, you will be able to call methods or variable directly without having to create a object
	//if you use static extensively then it will effect the performance of system
	static String name="Bruce";
	static int age =15;
	
	public static void info() {
		
		System.out.println("calling method info from emp class");
	}
	
	public static void disp() {
		
		System.out.println("Emp disp from emp class");
	}

	public static void main(String[] args) {
		
		
		info();
		disp();
		System.out.println(name);
		System.out.println(age);

	}

}
