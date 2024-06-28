package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;





public class WebdriverSetup {
	 public static WebDriver createChromeWebDriver() {
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions chromeOptions = new ChromeOptions();
	        WebDriver driver = new ChromeDriver(chromeOptions);
	        driver.get(Helper.BASE_URL);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Helper.IMPLICIT_WAIT_TIMEOUT));
	        driver.manage().window().maximize();
	        return driver;
	    }
	 

	    public static WebDriver createEdgeWebDriver() {
	        WebDriverManager.edgedriver().setup();
	        EdgeOptions edgeOptions = new EdgeOptions();
	        WebDriver driver = new EdgeDriver(edgeOptions);
	        driver.get(Helper.BASE_URL);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Helper.IMPLICIT_WAIT_TIMEOUT));
	        driver.manage().window().maximize();
	        return driver;
	    }
}
