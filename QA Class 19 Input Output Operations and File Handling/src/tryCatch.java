
public class tryCatch {

	public static void main(String[] args) {
		
		try
		{
		int a=10;
		int b=10/1;
		System.out.println(b);
		}
		catch(Exception v) 
		{
		System.out.println("cannot divide by zero");	
		v.printStackTrace();
			
		}
		
		
		
		int j=30;
		int k=20;
		int add=j+k;
		int sub=j-k;
		int mul=j*k;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		
		
	}

}
