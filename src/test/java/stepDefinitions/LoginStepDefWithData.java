package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefWithData {


	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("the user enters the valid credentials {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();

	}
	@Then("should see the homepage")
	public void should_see_the_homepage() {
		boolean status =	driver.findElement(By.linkText("Dashboard")).isDisplayed();
		Assert.assertTrue(status);
	}



}
