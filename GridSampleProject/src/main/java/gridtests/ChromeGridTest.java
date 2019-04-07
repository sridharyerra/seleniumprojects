package gridtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws Throwable {
		DesiredCapabilities dcap=new DesiredCapabilities();
		dcap.setBrowserName("chrome");
		dcap.setPlatform(Platform.WIN10);
		ChromeOptions options=new ChromeOptions();
		options.merge(dcap);
		String huburl="http://10.137.13.100:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(huburl),options);
		driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://ui.cogmento.com/");
		//driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		  driver.findElement(By.name("email")).sendKeys("talk2sree@gmail.com");
			driver.findElement(By.name("password")).sendKeys("citcat1$");
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
 		System.out.println(driver.getCurrentUrl());
 		driver.close();

	}

}
