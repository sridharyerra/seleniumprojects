//package Stepdefinitionfiles;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class DealsMap {
//WebDriver driver;
//@Given("^user is already in deals login page$")
//public void user_is_already_in_deals_login_page()  {
//    // Write code here that turns the phrase above into concrete actions
//	 System.setProperty("webdriver.gecko.driver","/seleniumproject/Seleniummorningautomation/src/drivers/geckodriver.exe");
//		driver=new FirefoxDriver();
//	driver.manage().window().maximize();
//	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("https://ui.cogmento.com/");
//}
//
//@Then("^user enters emailid and password$")
//public void user_enters_emailid_and_password(DataTable login)  {
//	for(Map<String,String> logindata:login.asMaps(String.class, String.class)){
//    // 
//	driver.findElement(By.name("email")).sendKeys(logindata.get("username"));
//	driver.findElement(By.name("password")).sendKeys(logindata.get("password"));
//	}
//}
//
//@Then("^user clicks deals login button$")
//public void user_clicks_deals_login_button(){
//   
//	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); 
//}
//
//@Then("^user clicks new deals page$")
//public void user_clicks_new_deals_page()  {
//    // Write code here that turns the phrase above into concrete actions
//	driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//	driver.findElement(By.xpath("//a[@href='/deals/new']//button[@class='ui linkedin button']")).click();
//}
//
//@Then("^user enter deal$")
//public void user_enter_deal(DataTable deals) throws Exception  {
//	for(Map<String,String> data:deals.asMaps(String.class, String.class)){
//	    // 
//		driver.findElement(By.name("title")).sendKeys(data.get("Title"));
//		driver.findElement(By.name("description")).sendKeys(data.get("Description"));
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//		driver.findElement(By.xpath("//a[@href='/deals/new']//button[@class='ui linkedin button']")).click();
//		}
//	//driver.close();
//}
//
//}
