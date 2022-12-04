package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderDef {
	WebDriver driver;

	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("You are enters the below credentials")
	public void you_are_enters_the_below_credentials(DataTable dataTable) {
		List<String> credentials = dataTable.asList(String.class);
		String userName =	credentials.get(0);
		String passWord =credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		
	}

	@When("You are on the login button")
	public void you_are_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();

	}



}
