package qa.sampleproject.testngtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterTest {
WebDriver driver;
@Test
@Parameters({"url"})
	public void yahooTitleTest(String url){
		 System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			String expected="Yahoo - login";
			String actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
			driver.close();
	}
}
