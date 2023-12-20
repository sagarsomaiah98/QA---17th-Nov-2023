package Variable;

public class LocalVariable {
	//any variable when defined insided the method then its local variable, scope of local variable is only inside the method
	
	public void m1() 
	{
		String name="lee";
		int age=20;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void m2() {
		String name="Kate";
		int age=10;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		
		LocalVariable l = new LocalVariable();
		l.m1();
		l.m2();
		
	}

}
