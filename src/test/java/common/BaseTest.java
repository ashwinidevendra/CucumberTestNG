package common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.Helper;
import util.WebdriverSetup;



public class BaseTest {


	public static WebDriver createWebDriver(String browser) {

		if (browser.equalsIgnoreCase(Helper.BROWSER_CHROME)) {
			return WebdriverSetup.createChromeWebDriver();
		} else if (browser.equalsIgnoreCase(Helper.BROWSER_EDGE)) {
			return WebdriverSetup.createEdgeWebDriver();
			}else {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
	}	



		public static String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
			return testCaseName;
			/*
			 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
			 * ts.getScreenshotAs(OutputType.FILE); File file = new
			 * File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
			 * FileUtils.copyFile(source, file); return System.getProperty("user.dir") +
			 * "//reports//" + testCaseName + ".png";
			 */

		}
	}
