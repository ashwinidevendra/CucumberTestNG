package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;

import common.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.Helper;

public class TcketBook extends BaseTest{
	WebDriver driver;
	HomePage home;

	public	 TcketBook(){
		driver=createWebDriver("chrome");
		home=new HomePage(driver);
	}

	
	@Given("open website")
	public void open_website() {
		System.out.println("Ashwini i  heree");
		driver.get(Helper.BASE_URL);
		System.out.println("I am on " +driver.getTitle());

	}
	
	@Given("Enter {string} and {string}")
	public void enter_and(String string, String string2) {
		home.loginToNoukri(string, string2);
	}

	@Then("Check Login {string}")
	public void check_login(String string) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("I am on " +driver.getTitle());
		if (string.equals("success")) {
		assertEquals(driver.getTitle().contains("Home | Mynaukri"), true);
		}else {
			assertEquals(driver.getTitle().contains("Home | Mynaukri"), false);
		}
	}



	@When("Hit Login")
	public void hit_login() {
		home.clickOnLogin();
	}

	
	
	@After
	public void closeBrowser(){
		//driver.close();
	}

	
	

}
