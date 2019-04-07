package qa.sampleproject.testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(customlistner.class)
public class screenshottest extends base {
	SoftAssert sa=new SoftAssert();
	@BeforeMethod
	
	public void setup(){
		initilization();
	}
	
@AfterMethod
	
	public void teardown(){
		System.out.println("Done");
		driver.quit();
	}
	
	
	@Test
	public void takescreenshot(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takescreenshot1(){
		sa.assertEquals(false, true);//soft assert is used
		sa.assertAll();
	}
   
	
	
	
	
	
	

}
