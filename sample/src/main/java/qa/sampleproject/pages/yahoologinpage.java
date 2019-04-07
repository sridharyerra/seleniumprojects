package qa.sampleproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.sampleproject.basepage.TestBase;

public class yahoologinpage extends TestBase {
	
	@FindBy(id="login-username")
	 WebElement username;
	 @FindBy(id="login-passwd")
	 WebElement password;
	 @FindBy(name="signin")
	 WebElement next;
	 @FindBy(xpath="//button[@id='login-signin']")
	 WebElement signin;
	 @FindBy(xpath="//button[strats-with(@id,'yui_3_18_0_3_1550583430883')]")
	 WebElement mailclick;
	 @FindBy(xpath="//img[contains(@class,'logo')]")
	 WebElement yahoologo;
	 
	 public yahoologinpage(){
		 PageFactory.initElements(driver, this);
	 }
	 
	 public  void yahoologin(String uid, String pwd)    {
		 username.sendKeys(uid);
		// Thread.sleep(2000);
		 next.click();
		 password.sendKeys(pwd);
		 signin.click();
		
		 
	 }
	 
	 public  void validateMailLink()    {
		 mailclick.click();
		 
	 }
    public String validateYahooPageTitle(){
    	return driver.getTitle();
    }
    public Boolean validateYahooLogo(){
    	return yahoologo.isDisplayed();
    }

}
