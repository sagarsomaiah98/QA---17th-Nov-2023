package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Examples {
	
	@Test
	public void method1() {
		
		System.out.println("METHOD1");
	}
	
	@Test
	public void method2() {
		
		System.out.println("METHOD2");
	}
	
	@BeforeMethod
	public void intial() {
		System.out.println("****calling intial*****");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("****calling teardown*****");
	}
	
	
	@BeforeTest	
	public void beforetest() {
		System.out.println("****beforetest*****");
	}
	
	@AfterTest	
	public void aftertest() {
		System.out.println("****aftertest*****");
	}

	@BeforeClass
public void beforeclass() {
	System.out.println("****BEFORE CLASS *****");
}
	@AfterClass
	public void afterclass() {
		System.out.println("****AFTER CLASS *****");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("****BEFORE SUITE *****");
	}
		@AfterSuite
		public void aftesuite() {
			System.out.println("****AFTER SUITE *****");
		}
	
	
	
}
