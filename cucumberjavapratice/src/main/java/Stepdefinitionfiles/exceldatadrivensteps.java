//package Stepdefinitionfiles;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//
//public class exceldatadrivensteps {
//	Scenario scenario;
//	WebDriver driver;
//   getdatafromexcel data=new getdatafromexcel();
//	@Before
//	public void before(Scenario scenario) {
//	    this.scenario = scenario;
//	}
//	By plantcode = By.xpath("//input'ext-comp-1092']"); 
//	
//	@Given("^Open chrome browser and start application for \"([^\"]*)\"$")
//	public void open_chrome_browser_and_start_application_for(String arg1)  {
//		
//	}
//
//	@Given("^Select enterprise code is \"([^\"]*)\" and plant is \"([^\"]*)\"$")
//	public void select_enterprise_code_is_and_plant_is(String plantcode, String enterprisecode) throws IOException  {
//		driver.findElement(By.xpath("//input'ext-comp-1092'")).sendKeys(data.get(scenario.getName(), enterprisecode));
//		}
//	@When("^Click \"([^\"]*)\" radio button and click search$")
//	public void click_radio_button_and_click_search(String arg1)  {
//	    
//	}
//
//	@When("^Select shipnode as \"([^\"]*)\" from results and click on Submit button to \"([^\"]*)\" and Confirm$")
//	public void select_shipnode_as_from_results_and_click_on_Submit_button_to_and_Confirm(String arg1, String arg2)  {
//	    
//	}
//}
