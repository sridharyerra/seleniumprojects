package qa.sampleproject.testngtests;

import org.testng.annotations.Test;

public class invocationCount {
@Test(invocationCount=10)
public void sum(){
	int sum=0;
	int a=20;
	int b=30;
	sum=a+b;
	System.out.println(sum);
			
			
}
}
