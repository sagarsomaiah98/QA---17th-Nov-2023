import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SauceTests {
	@Test
	public void logintest() {
		System.out.println("logintest");
	}
	
	@Test
	public void addtocarttest() {
		System.out.println("addtocarttest");
		assertEquals(true,false);
		System.out.print("executed addtocart test");
		
	}
	
	@Test
	public void logouttest() {
		System.out.println("logouttest");
		assertEquals(true,true);
		System.out.print("executed logout test");
		
	}

}
