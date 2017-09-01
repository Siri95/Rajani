package Banking.uiActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	@FindBy(xpath = ".//*[@id='email']")
	WebElement loginEmailAddr;
	
	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement loginPassword;
	
	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	WebElement loginClick;
	
	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")	
	WebElement authenticationFailed;
	
	public HomePage(WebDriver driver)
	 {
	  this.driver=driver;
	  PageFactory.initElements(driver, this); 
	 }
	
	public void loginToApplication()
	{
		signIn.click();
		loginEmailAddr.sendKeys("test@gmail.com");
		loginPassword.sendKeys("password");
		loginClick.click();
		
	}
	
	public String getInvalidLoginText()
	{
			  return authenticationFailed.getText();
	}
	
}


