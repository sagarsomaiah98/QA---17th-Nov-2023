package Inheritance;

public class A  {
	String family="Charles";
	char grade='H';
	
	public void factory() {
		
		System.out.println("Factory belongs to A");
	}
	
	public void house() {
		
		System.out.println("House belongs to A");
	}

	public static void main(String[] args) {
		
    A a= new A();
    a.factory();
    a.house();
    System.out.println(a.family);
    System.out.println(a.grade);
	//a.car();	
		
	}

}
