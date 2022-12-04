package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	    
	}
	@And ("^clicks on the login button$")
	public void clicks_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	  
	}
	@Then("^the use should be navigated to home page$")
	public void the_use_should_be_navigated_to_home_page() {
		
	boolean status =	driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
	   Assert.assertTrue(status);
	}



}
