package ErrorScrrenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
  @Test
  public static void initialization() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
	 }
  
  public void failed(String testMethodName) throws IOException
  {
File ScrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(ScrFile,new File("C:\\Programs\\pall\\SampleTestNG\\Scrrenshots"
+testMethodName+"-"+".jpg"));
	



  
}
  
}
