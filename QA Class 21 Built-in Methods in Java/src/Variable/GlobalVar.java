package Variable;

public class GlobalVar {
	//global variables
	
	String name="bob";
	char grade='A';
	
	public void method1() {
		System.out.println(name);
		System.out.println(grade);
		
	}
	
	public void method2() {
		
		System.out.println(grade);
		System.out.println(name);
	}

	public static void main(String[] args) {
		GlobalVar g = new GlobalVar();
		g.method1();
		g.method2();
		System.out.println(g.grade);
		System.out.println(g.name);
		

	}

}
