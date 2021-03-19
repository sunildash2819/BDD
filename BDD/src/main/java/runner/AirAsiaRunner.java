package runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"},
glue="assignmentsstepdefs",
tags= {"@AirAsia"},
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:report\\AirAsiaTestReport.html",
		"pretty","html:Reports/cucumber","json:target/cucumber/cucumber.json"},
monochrome=true,
dryRun=false
				)
public class AirAsiaRunner extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static  void writeExtentReport() throws Exception
	{
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}
}
