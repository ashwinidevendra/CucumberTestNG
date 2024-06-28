package stepDefinations;

import org.openqa.selenium.WebDriver;

import common.BaseTest;
import io.cucumber.java.en.Given;
import util.Helper;

public class TcketBook extends BaseTest{
	WebDriver driver;
		 
	public	 TcketBook(){
		driver=createWebDriver("chrome");
		 }
	
	@Given("open website")
	public void open_website() {
	    System.out.println("Ashwini i  heree");
	    driver.get(Helper.BASE_URL);
	    
	}
}
