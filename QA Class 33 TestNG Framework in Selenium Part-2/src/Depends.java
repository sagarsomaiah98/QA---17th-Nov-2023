import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Depends {
	
	
	@Test
	public void login() {
		
		System.out.println("login test");
		assertEquals(true,true);
	}
	
	
	@Test(dependsOnMethods="login",priority=0)
	public void navigationMenu() {
		
		System.out.println("Navigation menu");
	}
	
	@Test(dependsOnMethods="login",priority=1)
	public void Menu() {
		
		System.out.println(" menu");
	}


}
