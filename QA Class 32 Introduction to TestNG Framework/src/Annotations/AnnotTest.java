package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotTest {
	
	@Test
	public void m1() {
		
		System.out.println("calling m1 from AnnotTest");
	}
	
	@BeforeTest	
	public void beforetest() {
		System.out.println("****beforetes AnnotTest*****");
	}
	
	@AfterTest	
	public void aftertest() {
		System.out.println("****aftertest AnnotTest*****");
	}

	@BeforeClass
public void beforeclass() {
	System.out.println("****BEFORE CLASS AnnotTest *****");
}
	@AfterClass
	public void afterclass() {
		System.out.println("****AFTER CLASS AnnotTest *****");
	}

}
