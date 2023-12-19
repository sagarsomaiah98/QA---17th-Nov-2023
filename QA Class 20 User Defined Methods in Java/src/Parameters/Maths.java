package Parameters;

public class Maths {
	
	//method with two arguments
	public void Addition(int a, int b)//arguments/parameters
	{
	
	int c=a+b;
	System.out.println("Addition of "+a+" and "+b+" is "+c);
	}

	public void sub(double j, double k) {
		
		double m=j-k;
		System.out.println("Subtraction of "+j+" and "+k+" is "+m);
	}
	
	public static void main(String[] args) {
		
		Maths m = new Maths();
		/*
		 * m.Addition(20, 30); m.Addition(100, 2000); m.Addition(56, 30); m.Addition(58,
		 * 90);
		 */
		
		m.sub(22.1, 45.23);
		
	}

}
