package Return;

public class Addition {
	
	public int add()
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers is "+c);
		
		return c;
	}
	

	public static void main(String[] args) {
		
		Addition AD = new Addition();
		int out=AD.add();
		System.out.println(out);
		
		if(out%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
	}

}
