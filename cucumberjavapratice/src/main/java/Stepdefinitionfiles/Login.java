//package Stepdefinitionfiles;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.collections.bag.SynchronizedSortedBag;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class Login {
//
//WebDriver driver;
//
//@Given("^user is already in yahoo page$")
//public void user_is_already_in_yahoo_page()  {
//    // Write code here that turns the phrase above into concrete actions
//    
//}
//
//@When("^title of yahoo page is Yahoo$")
//public void title_of_yahoo_page_is_Yahoo() {
//    // Write code here that turns the phrase above into concrete actions
//	 System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
//		driver=new FirefoxDriver();
//	driver.manage().window().maximize();
//	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
//   
//}
//
//@Then("^user enters username and user enters password$")
//public void user_enters_username_and_user_enters_password()  {
//	driver.findElement(By.id("login-username")).sendKeys("sridhar_yar");
//	driver.findElement(By.name("signin")).click();
//	driver.findElement(By.id("login-passwd")).sendKeys("xx1$");
//	
//}
//
//@Then("^user clicks on login button$")
//public void user_clicks_on_login_button() {
//   driver.findElement(By.id("login-signin")).click();
//  
//   driver.close(); 
//}
//@Given("^user currently in yahoo page$")
//public void user_currently_in_yahoo_page()  {
//    // Write code here that turns the phrase above into concrete actions
//	System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
//	driver=new FirefoxDriver();
//driver.manage().window().maximize();
//  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  driver.get("https://in.yahoo.com/");
//System.out.println(driver.getTitle());
//}
//
//@When("^yahoo login ttile is yahoo$")
//public void yahoo_login_ttile_is_yahoo()  {
//    // Write code here that turns the phrase above into concrete actions
//	//Alert a=driver.switchTo().alert();
//	//a.dismiss();
//	String s=driver.getCurrentUrl();
//	System.out.println(s);
//	
//	
//}
//
//@Then("^user clicks mail link$")
//public void user_clicks_mail_link()  {
//    // Write code here that turns the phrase above into concrete actions
//	driver.findElement(By.id("uh-search-box")).sendKeys("hello");
//	driver.findElement(By.id("uh-search-button")).click();
//	   driver.close();
//}
//
//}
