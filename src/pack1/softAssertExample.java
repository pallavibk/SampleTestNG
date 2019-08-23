package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertExample 
{
	
	 
	 
	 @Test(priority=1)
	  public void f2() {
		   System.out.println("1st statment");
		  System.out.println("2nd statment");
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals("1","2");
		  System.out.println("3rd statment");
		  softAssert.assertAll();
		  
		//output
		  //1st statment
		  //2nd statment
		  //3rd statment
		  //fail the resullt
		 
	  }
}
