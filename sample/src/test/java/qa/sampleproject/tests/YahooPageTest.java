package qa.sampleproject.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.sampleproject.basepage.TestBase;
import qa.sampleproject.pages.yahoologinpage;

public class YahooPageTest extends TestBase {
	public static yahoologinpage yahoopage;
	public YahooPageTest(){
		super();
	}
  @BeforeMethod
  public void setup(){
	  initilization();
	  yahoopage=new yahoologinpage();
  }
  @AfterMethod
  public void teardown(){
	  driver.quit();
  }
  @Test(priority=1)
  public void yahooLogoTest(){
	Boolean flag=  yahoopage.validateYahooLogo();
	Assert.assertTrue(flag);
  }
  @Test(priority=2)
  public void yahooTitleTest(){
	  String title=yahoopage.validateYahooPageTitle();
	  Assert.assertEquals(title, "Yahoo - login");
  }
  @Test(priority=3)
  public void loginTest(){
	  yahoopage.yahoologin(prop.getProperty("username"), prop.getProperty("password"));
  }
}
