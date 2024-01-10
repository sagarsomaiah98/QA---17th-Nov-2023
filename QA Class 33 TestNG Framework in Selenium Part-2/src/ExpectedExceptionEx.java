import org.testng.annotations.Test;

public class ExpectedExceptionEx {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1() {
		
		int a=10;
		int b=10/0;
		System.out.println(b);
		
	}

}
