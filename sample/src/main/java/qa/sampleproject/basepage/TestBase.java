package qa.sampleproject.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import qa.sampleproject.utilities.WebEventLister;
import qa.sampleproject.utilities.util;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static EventFiringWebDriver e_driver;
public static WebEventLister eventlistner;
public static Logger log;
public TestBase() {
	try
	{
	prop=new Properties();
	FileInputStream is=new FileInputStream("/seleniumproject/sample/src/main/java/qa/sampleproject/configproperties/config.properties");
    prop.load(is);
    } catch(FileNotFoundException e){
    	e.printStackTrace();
    } catch(IOException e){
    	e.printStackTrace();
    }
}
  public void initilization(){
	  String browserType=prop.getProperty("browser");
	  if(browserType.equals("firefox")){
		  System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
	  }
	  else if(browserType.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "/Selenium softwares/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
	  }
	  else if(browserType.equalsIgnoreCase("ie")){
		  System.setProperty("webdriver.ie.driver","/seleniumproject/Seleniummorningautomation/src/drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
	  }
	  e_driver=new EventFiringWebDriver(driver);
	  eventlistner=new WebEventLister();
      e_driver.register(eventlistner);
	 driver=e_driver;
		log=Logger.getLogger("TestBase.class");	
		PropertyConfigurator.configure("Log4j.properties");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(util.page_load_wait, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(util.implicit_wait, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
  }

}
