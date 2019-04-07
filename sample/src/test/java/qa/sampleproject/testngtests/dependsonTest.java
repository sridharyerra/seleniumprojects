package qa.sampleproject.testngtests;

import org.testng.annotations.Test;

public class dependsonTest {

	@Test
	public void login(){
		int i=10/0;
		System.out.println(i);
	}
	@Test(dependsOnMethods="login")
	public void depends(){
		System.out.println("Depends on Login test pass");
	}
}
