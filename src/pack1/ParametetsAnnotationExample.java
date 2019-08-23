package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametetsAnnotationExample {
	private static WebDriver driver;
  @Test 
	  
	  @Parameters({ "sUsername", "sPassword" })
	 
	  public void test(String sUsername, String sPassword) {
	 
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.name("userName")).sendKeys(sUsername);
			driver.findElement(By.name("password")).sendKeys(sPassword);
			driver.findElement(By.name("login")).click();
	    driver.quit();
	 
	  }
	 

  }

