package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.TestBase;

public class LoginPage extends TestBase{
	
     @FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
      @FindBy(xpath="//input[@id='password']")
      WebElement password;

	 @FindBy(xpath="//input[@id='login-button']")
	 WebElement login;
	
	 @FindBy(xpath="//h3[@data-test='error']")
	public  WebElement errormsg;

	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String uname, String pwd) {
		
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
}
