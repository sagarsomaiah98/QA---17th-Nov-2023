import org.testng.annotations.Test;

public class TimeOutEx {
	
	
	@Test(invocationTimeOut=1)
	public void timeoutTest() {
		
		int i=3;
		
		while(i>2) {
			System.out.println(i);
		}
		
		
	}

}
