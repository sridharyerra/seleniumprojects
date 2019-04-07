package qa.sampleproject.testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {

	
	@Test(retryAnalyzer=qa.sampleproject.pages.retryAnalyzer.class)
	public void test1(){
		Assert.assertEquals(false, true);
	}
	@Test(retryAnalyzer=qa.sampleproject.pages.retryAnalyzer.class)
	public void test2(){
		Assert.assertEquals(true, true);
	}
}
