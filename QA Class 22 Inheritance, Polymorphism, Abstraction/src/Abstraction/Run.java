package Abstraction;

public class Run extends Abstraction_Ex {

	public static void main(String[] args) {
		Run r = new Run();
		r.method1();
		r.method2();
		r.method3();

	}

	@Override
	public void method1() {
		System.out.println("calling method1");
		
	}

	@Override
	public void method2() {
		System.out.println("calling method 2");
		
	}

}
