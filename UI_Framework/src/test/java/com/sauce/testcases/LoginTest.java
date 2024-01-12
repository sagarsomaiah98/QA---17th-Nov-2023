package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialize();
	}
	
   @Test
	public void validLogin() throws IOException {
		
		
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		
	}
   
   
   @Test
  	public void inValidLogin() throws IOException {
  		
  		
  		LoginPage login= new LoginPage();
  		login.login("username1", "secret_sauce1");
  		
  		assertEquals(login.errormsg.getText(), "Epic sadface: Username and password do not match any user in this service");
  		
  	}
   
   @AfterMethod
   public void teardown() {
	   
	   driver.quit();
   }

}
