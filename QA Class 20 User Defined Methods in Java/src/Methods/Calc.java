package Methods;

public class Calc {
	
	//AccessModifier returnType methodName
	
	public void Addition()//no parameter / no argument
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
	
	
	public void Subraction()
	{
	int k=50;
	int j=30;
	int l=k-j;
	System.out.println("Subtraction of "+k+" and "+j+" is "+l);
	}
	
	public static void main(String[] args) {

// how to create a object?
		// ClassName objectName = new ClassName
		Calc c= new Calc();
		//c.Subraction();
		c.Addition();
		c.Addition();
	//	c.Subraction();
		



	}

}
