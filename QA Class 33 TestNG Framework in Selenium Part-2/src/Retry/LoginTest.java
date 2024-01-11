package Retry;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(retryAnalyzer=Retry.RetryAnalyzer.class)
	public void logintest() {
		
		System.out.println("calling login Test");
		assertEquals(true, false);
		
	}

}
