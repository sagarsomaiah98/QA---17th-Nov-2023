package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	
       try {
			
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce1");	
		driver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("LOGIN SUCCESSFUL - TEST PASSED");
       }
       catch(Exception e){
    	   System.out.println("LOGIN FAILED - TEST FAILED");
    	   String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
    	   System.out.println(error);
       }
       {
		driver.quit();


	}
		
	}

	public static void main(String[] args) throws InterruptedException {
		

}
}
