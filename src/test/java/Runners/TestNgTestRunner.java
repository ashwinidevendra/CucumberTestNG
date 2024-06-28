package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinations",
        monochrome = true,
        plugin = {"json:reports/cucumber/test.json", "html:reports/cucumber/testReport.html"}
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}