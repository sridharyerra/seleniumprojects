//package Stepdefinitionfiles;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class withoutexample {
//	WebDriver driver;
//	@Given("^user is in yahoo page$")
//	public void user_is_in_yahoo_page()  {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
//		driver=new FirefoxDriver();
//	driver.manage().window().maximize();
//	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");  
//	}
//
//	@When("^yahoopage tile is yahoo$")
//	public void yahoopage_tile_is_yahoo()  {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@Then("^user input \"(.*)\" and \"(.*)\"$")
//	public void user_input_and(String username, String password)  {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	    driver.findElement(By.id("login-username")).sendKeys(username);
//		driver.findElement(By.name("signin")).click();
//		driver.findElement(By.id("login-passwd")).sendKeys(password);
//		
//	}
//
//	@Then("^user clicks signin icon$")
//	public void user_clicks_signin_icon()  {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("login-signin")).click();
//		  
//		   driver.close();   
//	}
//
//
//}
