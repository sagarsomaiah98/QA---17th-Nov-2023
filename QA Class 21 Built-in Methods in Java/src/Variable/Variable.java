package Variable;

public class Variable {
	String name="Kevin";
	int age=25;
	double height=5.5;
	
	
	public void info() {
		String name="Jack";
		int age =40;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
	
	public void disp() {
		String name="Steve";
		int age =5;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);		
		
	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.info();
		System.out.println("**********************");
		v.disp();
		System.out.println("**********************");
		System.out.println(v.name);
		System.out.println(v.age);
		System.out.println(v.height);
		

	}

}
