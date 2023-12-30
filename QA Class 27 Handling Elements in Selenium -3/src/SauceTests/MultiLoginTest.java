package SauceTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiLoginTest {
	
	
	public void verifyLogin(String uname, String pwd) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	
       try {
			
		driver.findElement(By.cssSelector("#user-name")).sendKeys(uname);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);	
		driver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(uname+" -> LOGIN SUCCESSFUL - TEST PASSED");
       }
       catch(Exception e){
    	   System.out.println(uname+ "LOGIN FAILED - TEST FAILED");
    	  // String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
    	//   System.out.println(error);
       }
       {
		driver.quit();


	}
		
	}

	public static void main(String[] args) {
		MultiLoginTest m = new MultiLoginTest();
		m.verifyLogin("standard_user","secret_sauce");
		m.verifyLogin("locked_out_user","secret_sauce");
		m.verifyLogin("problem_user","secret_sauce");
		m.verifyLogin("performance_glitch_user","secret_sauce");
		m.verifyLogin("error_user","secret_sauce");
		m.verifyLogin("visual_user","secret_sauce");
		
		
		
			
			
		}
	}


