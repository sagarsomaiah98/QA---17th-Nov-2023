package Methods;

public class Employee {
	double salary=2345.23;
	String name="Lee";
	int age=30;

	
	
	public void info() {
		char grade='A';
		String role="Manager";
		System.out.println(grade);
		System.out.println(role);
		
		
	}
	

	public static void main(String[] args) {
	
	
		Employee e =new Employee();
		e.info();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		

	}

}
