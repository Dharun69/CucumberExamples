package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDef {
	WebDriver driver;

	@Given("login page is visible on the screen to log")
	public void login_page_is_visible_on_the_screen_to_log() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enter the US and PW")
	public void user_enter_the_us_and_pw(DataTable dataTable) {

		List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class, String.class);

		String userName =	keyValuePair.get(0).get("Username");
		String passWord = keyValuePair.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.


	}
	@When("Click the sumbit")
	public void click_the_sumbit() {
		driver.findElement(By.id("btnLogin")).click();


	}


}
