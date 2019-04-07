//package Stepdefinitionfiles;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Hooks {
//
//	@Before
//	public void openurl(){
//		System.out.println("User opened URL");
//	}
//	@After
//	public void teardown(){
//		System.out.println("Closed the browser");
//	}
//	@Before("@First")
//	public void openurl1(){
//		System.out.println("first scenarion pre condition");
//	}
//	@After("@First")
//	public void teardown1(){
//		System.out.println("first scenario post condition");
//	}
//	@Before("@Second")
//	public void openurl2(){
//		System.out.println("second scenarion pre condition");
//	}
//	@After("@Second")
//	public void teardown2(){
//		System.out.println("second scenario post condition");
//	}
//	@Given("^user is already in CRM loginpage$")
//	public void loginpage(){
//		
//		System.out.println("User is in Login Page");
//	}
//	@When("^user click newdeal$")
//	public void newdeal(){
//		System.out.println("User is in new deal Page");
//	}
//	@Then("^user enter deal$")
//	public void deal(){
//		System.out.println("User creted deal");	
//		
//	}
//	
//	@Given("^user is already in CRM contacts$")
//	public void contactpage(){
//		System.out.println("user is in contacts page");
//	}
//	@When("^user click contacts$")
//	public void newcontact(){
//		System.out.println("user created contact");
//	}
//}
