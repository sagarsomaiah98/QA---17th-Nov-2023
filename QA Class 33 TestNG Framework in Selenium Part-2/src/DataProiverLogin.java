import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProiverLogin {
	
	
	@Test(dataProvider="data")
	public void method(String uname, String pwd) {
		
		System.out.println(uname+" | "+pwd);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.quit();
		
		
	}
	
	
	
	@DataProvider(name="data")
	public Object[][] testData() {
		
		return new Object[][] {{"standard_user","secret_sauce"},
			        
			                   {"locked_out_user","secret_sauce",} ,
			                   
			                   {"performance_glitch_user","secretsauce"}  
		};
		
		
	}

}
