package Banking.homePage;

import org.testng.annotations.Test;

import Banking.testbase.TestBase;
import Banking.uiActions.HomePage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC001_VerifyLoginInvalidCredentials extends TestBase{
	 WebDriver driver;
	 HomePage hmpage;
	 public void setup()
	 
	 {
		 init();
	 }
	 
  @Test
  public void f() {
	  hmpage = new HomePage(driver);
	  
	  hmpage.loginToApplication();
	  
	  Assert.assertEquals(hmpage.getInvalidLoginText(), "Authentication failed.");
	 
	   }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Lib//chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://automationpractice.com/index.php");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	   
  }

  @AfterTest
  public void afterTest() {
	  closeBrowser();
  }

}
