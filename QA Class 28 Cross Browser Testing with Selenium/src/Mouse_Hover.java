

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		

		

		WebDriver driver= new ChromeDriver(); // launch the browser
		
		
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/");
	
	
	Actions action= new Actions(driver);
	
	//mouse hover
	action.moveToElement(driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"))).build().perform();
	
	driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();
		
}
	
}
