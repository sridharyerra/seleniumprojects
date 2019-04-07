package qa.sampleproject.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.sampleproject.basepage.TestBase;
import qa.sampleproject.pages.yahoologinpage;

public class SampleTest extends TestBase {
	public static yahoologinpage yahoopage;
	public SampleTest(){
		super();
	}
  @BeforeMethod
  public void setup(){
	  initilization();
	  log.info("BROWSER");
	  log.warn("WARNING");
	  log.fatal("Fatal erro");
	  log.error("Error");
	  yahoopage=new yahoologinpage();
  }
  @AfterMethod
  public void teardown(){
	  driver.quit();
  }
 
  @Test(priority=3)
  public void loginTest(){
	  yahoopage.yahoologin(prop.getProperty("username"), prop.getProperty("password"));
  }
}
