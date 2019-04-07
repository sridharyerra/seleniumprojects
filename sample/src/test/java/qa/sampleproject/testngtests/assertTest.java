package qa.sampleproject.testngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTest {

	WebDriver driver;
	@Test
	public void yahooTitleTest(){
		 System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://login.yahoo.com/");
			String expected="Yahoo - login";
			String actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
			driver.close();
	}
	@Test
	public void yahoologotest(){
		 System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://login.yahoo.com/");
			Boolean b=driver.findElement(By.className("logo")).isDisplayed();
			
			Assert.assertTrue(b);
			
	}
}
