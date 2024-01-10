import org.testng.annotations.Test;

public class MutlipleExecution {
	
	@Test(invocationCount=10)
	public void test1() {
		System.out.println("calling Test");
		
	}

}
