package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class AddtoCartTest extends TestBase{
	@BeforeMethod
	public void init() throws IOException {
		intialize();
	}
	
	
	@Test
	public void addtocarttest() {

		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		
		HomePage homepage= new HomePage();
		homepage.addtocart();
		
		
	}
	   @AfterMethod
	   public void teardown() {
		   
		   driver.quit();
	   }


}
