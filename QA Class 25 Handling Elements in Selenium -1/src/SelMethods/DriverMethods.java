package SelMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo/");
		Thread.sleep(2000);
 String title=driver.getTitle();

 System.out.println("Title -> "+title);
 
String source= driver.getPageSource();
System.out.println("Source-->"+source);
	}

}
