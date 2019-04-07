package qa.sampleproject.tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import qa.sampleproject.basepage.TestBase;

public class volcalc extends TestBase {
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Selenium softwares/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
       
        driver.get("https://www.calculator.net");

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.calculator.net");
        driver.getTitle();
       // log.info("opening browser");
       // log.warn("warning");
        driver.findElement(By.linkText("Volume Calculator")).click();
        driver.findElement(By.className("inhalf")).sendKeys("10");
      //  String s=driver.findElement(By.name("ballcal")).getAttribute("Calculate");
      //  System.out.println(s);
        driver.findElement(By.name("ballcal")).click();
        System.out.println(driver.findElement(By.className("bigtext")).getText());
	    driver.close();
	}

}
