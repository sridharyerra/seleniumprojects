package Stepdefinitionfiles;

import org.testng.Assert;

import cucumber.api.java.en.Given;

public class Tags {

	
	@Given("^user is already in CRM loginpage$")
	public void user_is_already_in_CRM_loginpage() throws Throwable {
		  Assert.assertEquals(false, true);
	    
	}

	@Given("^user is already in CRM contactspage$")
	public void user_is_already_in_CRM_contactspage() throws Throwable {
	   
	}

	@Given("^user is already in CRM dealspage$")
	public void user_is_already_in_CRM_dealspage() throws Throwable {
		  Assert.assertEquals(false, true);
	    
	}

	@Given("^user is already in CRM opppage$")
	public void user_is_already_in_CRM_opppage() throws Throwable {
	    
	}

	@Given("^user is already in CRM homepage$")
	public void user_is_already_in_CRM_homepage() throws Throwable {
	    
	}

	@Given("^user is already in CRM leadspage$")
	public void user_is_already_in_CRM_leadspage() throws Throwable {
	   Assert.assertEquals(false, true);
	}

	@Given("^user is already in CRM signout$")
	public void user_is_already_in_CRM_signout() throws Throwable {
		  Assert.assertEquals(false, true);
	}

}
