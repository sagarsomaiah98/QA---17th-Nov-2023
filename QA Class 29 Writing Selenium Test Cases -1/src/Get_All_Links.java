import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links  {
	
	
	public static void verifyLink(String url) throws IOException {
		
		URL link= new URL(url);
		HttpURLConnection httpconn= (HttpURLConnection) link.openConnection();
		
		if(httpconn.getResponseCode()==200)
		System.out.println(url+" -> is  working ");
		else
	   System.out.println(url+" -> is not working");
		
		
	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());//total number of links
	
	for(int i=0;i<links.size();i++) {
		
		System.out.println(links.get(i).getText());//names of links
		//System.out.println(links.get(i).getAttribute("href"));
		
		String href=links.get(i).getAttribute("href");
		verifyLink(href);
		System.out.println("_____________________________________________________________");
	}
	
		
	driver.quit();
		
	}
}
