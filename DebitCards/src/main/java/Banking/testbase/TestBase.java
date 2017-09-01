package Banking.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	String browser = "Chrome";
	String url="http://automationpractice.com/index.php";
	
	public WebDriver driver;
	
	   public void selectBrowser(String browser)
	   {
		   if(browser.equalsIgnoreCase("Chrome"))
		   {
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Lib//chromedriver.exe");
		   driver = new ChromeDriver();
		   }
		   else if(browser.equalsIgnoreCase("Firefox"))
		   {
			   System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Lib//chromedriver.exe");
			   driver = new FirefoxDriver();  
		   }
	   }
	   
	   public void getURL(String url)
	   {
		   driver.manage().window().maximize();
		   driver.get(url);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
	   }
	   
	   public void init()
	   {
		   selectBrowser(browser);
		   getURL(url);
	   }
	   
	   public void closeBrowser()
	   {
		   driver.quit();
	   }
	   
}
