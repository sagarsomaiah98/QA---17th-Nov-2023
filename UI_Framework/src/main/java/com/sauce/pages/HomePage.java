package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement SauceLabsBackpack_addtocart;	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement cart;
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	public WebElement filter;
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	public WebElement menu;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	public WebElement remove;
	

	
	//public WebElement twitter=driver.findElement(By.xpath("//a[normalize-space()='Twitter']"));
	
	//public WebElement facebook=driver.findElement(By.xpath("//a[normalize-space()='Facebook']"));
	
	//public WebElement linkedin=driver.findElement(By.xpath("//a[normalize-space()='LinkedIn']"));
	

	
	public  HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void addtocart() {
		
		SauceLabsBackpack_addtocart.click();
		cart.click();
		
		
	}
	
	
	

}
