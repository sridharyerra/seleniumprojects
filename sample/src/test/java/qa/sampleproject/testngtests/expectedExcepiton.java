package qa.sampleproject.testngtests;

import org.testng.annotations.Test;

public class expectedExcepiton {
@Test(expectedExceptions=NumberFormatException.class)
public void sum()
{
	String x="1000a";
	;
	System.out.println(Integer.parseInt(x));
}
}
