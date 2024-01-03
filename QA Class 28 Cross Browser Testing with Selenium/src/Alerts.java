


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		
		String msg= al.getText();
	//	al.accept();// click on ok
		al.dismiss();// click cancel or cancel the pop up 
		
		System.out.println(msg);
		
		driver.quit();
		
	}

}
