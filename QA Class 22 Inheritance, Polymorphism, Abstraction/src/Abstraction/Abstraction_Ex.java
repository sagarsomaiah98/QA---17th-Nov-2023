package Abstraction;

public abstract class Abstraction_Ex {
	
	//unimplemented
	public abstract void method1();
	
	public abstract void method2();
	
	//implemented
	public void method3() 
	{
		
		System.out.println("method 3");
	}

	public static void main(String[] args) {
		//creating object of abstract class is not allowed
	//Abstraction_Ex a = new Abstraction_Ex();

	}

}
