package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithExample {
	
	WebDriver driver;

	@Given("Proceed to login page")
	public void proceed_to_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enters {string} and password {string}")
	public void user_enters_and_password(String userName, String passWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	}
	@When("Clicked sumbit")
	public void clicked_sumbit() {
		driver.findElement(By.id("btnLogin")).click();

	}
}
