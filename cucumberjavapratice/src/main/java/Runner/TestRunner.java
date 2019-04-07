package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/seleniumproject/cucumberjavapratice/src/main/java/featurefiles/Deals.feature"
		,glue={"Stepdefinitionfiles"}
		, plugin={"pretty", "html:test-output", "json:json-output/cucumber.json", "junit:junit_xml/cucumber.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		,monochrome=true,//display output in console more readable format
		dryRun=false,//this will check mapping is correct between scenario and stepdefinition
		strict=true //this will check if any implementation missing in step definition
		//tags={"~@SmokeTest" , "@E2ETest"}
		)
public class TestRunner {
@AfterClass
public static void reportsetup(){
	Reporter.loadXMLConfig(new File("/seleniumproject/cucumberjavapratice/extentreport.xml"));
	Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	Reporter.setSystemInfo("2.3", "Selenium");
	Reporter.setSystemInfo("1.2.3", "Java");
	Reporter.setSystemInfo("Time Zone","Maven");
	Reporter.setTestRunnerOutput(" Cucumber Junit Test Runner");
}
}
