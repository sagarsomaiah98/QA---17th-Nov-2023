import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionEg {
	
	@Test
	public void assertex() {
		
		int a=20;
		
		/*
		 * if(a==10) System.out.println("pass"); else System.out.println("fail");
		 */
		
		assertEquals(a, 20);
		assertEquals("john", "john");
		assertEquals(4.5,"4.5");
		
	}

}
