import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
	    sel.selectByIndex(1);
	    
	    Thread.sleep(2000);
	    sel.selectByValue("Apple");
	    
	    Thread.sleep(2000);
	    sel.selectByVisibleText("Yahoo");
	    
	    //total number of dropdowns
	   List<WebElement> options=  sel.getOptions();
	   System.out.println(options.size());
	   
	   for(int i=0;i<options.size();i++) {
		   
		   System.out.println(options.get(i).getText());
		   driver.quit();
	   }
}
}
