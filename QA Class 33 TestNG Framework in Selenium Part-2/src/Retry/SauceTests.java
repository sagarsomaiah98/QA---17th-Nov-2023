package Retry;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SauceTests {
	
	@Test
	
	public void logintest() {
		
		assertEquals(true, true);
	}
	
	
	@Test
	public void ordertest() {
		assertEquals(false, true);
		
	}
	
	
	@Test
	public void logouttest() {
		
		assertEquals(true, false);
	}

}
