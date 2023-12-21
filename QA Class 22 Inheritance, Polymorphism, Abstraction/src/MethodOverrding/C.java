package MethodOverrding;

public class C extends P {
	
	public void house() {
		
		System.out.println("house belongs to c");
	}
	
	//method overriding-> 
	public void bike() {
		
		System.out.println("modified bike now belongs to C");
	}

	public static void main(String[] args) {
		
		C c = new C();
		c.car();
		c.bike();
		
		c.house();
		
		P p = new P();
		p.bike();

	}

}
