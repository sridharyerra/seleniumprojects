package qa.sampleproject.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.sampleproject.basepage.TestBase;
import qa.sampleproject.pages.yahoologinpage;
import qa.sampleproject.utilities.util;

public class yahooMailDatadriven extends TestBase {
	 yahoologinpage yahoopage;
	
	 String sheetname="testdaata";
	public yahooMailDatadriven(){
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
  @DataProvider
  public Object[][] getTestData1(){
	 Object data[][]= util.getTestData(sheetname);
	 return data;
  }
  
  @Test(priority=3, dataProvider="getTestData1()")
  public void loginTest( String UserName, String Password){
	  yahoopage.yahoologin(UserName,Password);
  }
}
