package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public Properties prop ;
	public static WebDriver driver;
	
	public void intialize() throws IOException {
		

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\sauce\\config\\config.properties");
		
	    prop = new Properties();
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		String url=prop.getProperty("Url");
		int timeout=Integer.parseInt(prop.getProperty("Timeout"));
		
		switch(bname) {
		case "Chrome":
			driver= new ChromeDriver();
			break;
		case "Edge":
			driver= new EdgeDriver();
			break;
		case "Firefox":
			driver= new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.get(url);
		
		
	}

}
