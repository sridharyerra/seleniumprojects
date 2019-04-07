package qa.sampleproject.testngtests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;




public class base {

	public static WebDriver driver;
	
	public static void initilization(){
		System.setProperty("webdriver.chrome.driver", "/Selenium softwares/chromedriver_win32/chromedriver.exe");
         driver= new ChromeDriver();
         driver.get("https://www.hul.co.in/brands/personal-care/liril.html");
	}
	public void failed(String testmethodname){
		File srcfile  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			System.out.println("reached");
			FileUtils.copyFile(srcfile, new File("/seleniumproject/Seleniumpractice/"
					+ "Screenshots/"+testmethodname+".jpg"));
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
