package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExplainingHooks {

	WebDriver driver;

	@Given("user is on the logged page")
	public void user_is_on_the_logged_page() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Hi");
	}
	@When("the user is trying to logging through username and password")
	public void the_user_is_trying_to_logging_through_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("the user logged in and clicked the my info")
	public void the_user_logged_in_and_clicked_the_my_info() {
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("My Info")).click();

	}
	@Then("user edit the and saved the details")
	public void user_edit_the_and_saved_the_details() {

		driver.findElement(By.xpath("//*[@value='Edit'] [@type='button'] [@id='btnSave']")).click();
		WebElement wb = driver.findElement(By.name("personal[txtEmpFirstName]"));
		wb.clear();
		wb.sendKeys("dharun");
		driver.findElement(By.id("btnSave")).click();

	}



}
