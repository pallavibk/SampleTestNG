package ErrorScrrenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListners.class)
public class screenshotExample  extends BaseClass{
 @BeforeMethod
 public void setup()
 {
	 initialization();
 }
 @AfterMethod
 public void closeUP()
 {
	driver.quit(); 
 }
	
	@Test
  public void fun1() 
	{
		SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(true,false);
		  System.out.println("1st statment");
		  softAssert.assertAll();
		
  }
	@Test
	  public void fun2() 
		{
		SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(true,false);
		  System.out.println("2nd statment");
		  softAssert.assertAll();
	  }
	@Test
	  public void fun3() 
		{
		SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(true,false);
		  System.out.println("3rd statment");
		  softAssert.assertAll();
	  }
}
