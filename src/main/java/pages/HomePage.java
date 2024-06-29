package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.WebdriverSetup;


public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="usernameField") 
	WebElement username;
	@FindBy(id="passwordField") 
	WebElement password;
	@FindBy(xpath="//button[text()='Login']") 
	WebElement login;
	
	public HomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginToNoukri(String user ,String password) {
		username.sendKeys(user);
		this.password.sendKeys(password);
	
		
	}
	public void clickOnLogin() {
		login.click();
	}

}
