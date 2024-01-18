package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class HomePageTest extends TestBase{
	@BeforeMethod
	public void init() throws IOException {
		intialize();
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
	}
	
	
	//@Test
	public void addtocarttest() throws IOException {

	
		HomePage homepage= new HomePage();
		homepage.addtocart();
		TestUtil.Screenshot();
		
		
	}
	
	//@Test
	public void removeitemtest() throws IOException {
	
		HomePage homepage= new HomePage();
		homepage.addtocart();
		homepage.removeFromCart();
		TestUtil.Screenshot();
		
		
		
	}
	
	@Test
	public void verifyTwitter() throws InterruptedException, IOException {

		HomePage homepage= new HomePage();
		homepage.twitter.click();
		TestUtil.switchWindow();
		TestUtil.Screenshot();
		Thread.sleep(2000);
		String title=driver.getTitle();
		assertEquals(title, "Twitter");
		
	}
	
	@Test
public void verifyFacebook() throws IOException {

	HomePage homepage= new HomePage();
	homepage.facebook.click();
	TestUtil.switchWindow();
	String title=driver.getTitle();
	TestUtil.Screenshot();
	assertEquals(title, "Facebook");
	
		
		
	}

	@Test
public void verifyLinkedin() throws IOException {

	HomePage homepage= new HomePage();
	homepage.linkedin.click();
	TestUtil.switchWindow();
	String title=driver.getTitle();
	TestUtil.Screenshot();
	
	assertEquals(title, "Linkedin");
}


@Test
public void filtertest() throws IOException {

	HomePage homepage= new HomePage();
	
	TestUtil.selectDropDown(homepage.filter, "Price (low to high)");
	TestUtil.Screenshot();
	TestUtil.selectDropDown(homepage.filter, "Name (A to Z)");
	TestUtil.Screenshot();
	TestUtil.selectDropDown(homepage.filter, "Price (high to low)");
	TestUtil.Screenshot();
	TestUtil.selectDropDown(homepage.filter, "Name (Z to A)");
	TestUtil.Screenshot();
	
}

@Test

public void logouttest() throws IOException {
	
	
		HomePage homepage= new HomePage();
		homepage.logout();
		TestUtil.Screenshot();
	
	
}
	   @AfterMethod
	   public void teardown() {
		   
		 driver.quit();
	   }


}
