package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
  
	  public WebDriver driver;

	  @Parameters("browser")

	  @BeforeTest
	  public void beforeTest(String browser) throws Exception {
	  if(browser.equalsIgnoreCase("firefox")) {

		  System.setProperty("webdriver.firefox.marionette",
					"C:\\Programs\\GekoDriver\\geckodriver-v0.24.0-win64\\GekoDriver.exe");
			WebDriver driver = new FirefoxDriver();
 }
	   else if (browser.equalsIgnoreCase("chrome")) { 
     System.setProperty("webdriver.chrome.driver",
					"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  } 
	   else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
	 
	  }
	  @Test
	  public void login() throws InterruptedException {
		  driver.get("http://newtours.demoaut.com/"); 
		  driver.findElement(By.name("userName")).sendKeys("batman");
			driver.findElement(By.name("password")).sendKeys("batman");
			driver.findElement(By.name("login")).click();
	}  

	  @AfterTest 
	  public void afterTest() {

			driver.quit();

		}

  
}
