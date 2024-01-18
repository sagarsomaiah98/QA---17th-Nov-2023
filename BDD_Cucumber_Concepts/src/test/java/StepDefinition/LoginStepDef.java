package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	public static WebDriver driver;
	
	@Given("I launch the chrome browser and I navigate to the url {string}")
	public void i_launch_the_chrome_browser_and_i_navigate_to_the_url(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(url);
	
	}

	@When("I enter the username {string} and enter the password {string}")
	public void i_enter_the_username_and_enter_the_password(String uname, String pwd) {
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	 
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.id("login-button")).submit();
	
	}

	@Then("I am logged in Successfully")
	public void i_am_logged_in_successfully() {
	  
		driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
	}

	@When("I add the items to the cart")
	public void i_add_the_items_to_the_cart() {

driver .findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	}
	
	@Then("I verify items is added to the cart")
	public void i_verify_items_is_added_to_the_cart() {

driver .findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
driver.findElement(By.xpath("//button[@id='continue-shopping']")).isDisplayed();
	}
	
	
	@Then("error message is displayed")
	public void error_message_is_displayed() {
	    driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
	}

}
