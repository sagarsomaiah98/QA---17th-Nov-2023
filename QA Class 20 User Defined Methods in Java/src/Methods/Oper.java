package Methods;

public class Oper {
	
	public void max() {
		int g=100;
		int h=50;
		if(g>h)
			System.out.print("Maximum number is "+g);
		else
			System.out.print("Maximum number is "+h);
		
	}
	
	public void squareroot() {
		int j=19;
		int sqrt=j*j;
		System.out.println("Square Root of "+j+" is "+sqrt);
		
	}
	

	public static void main(String[] args) {
		Oper op=new Oper();
		op.squareroot();
		op.max();
		
	}

}
