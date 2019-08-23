package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardassertExample {
    	
	 @Test(priority=1)
	  public void f2() {
		   System.out.println("1st statment");
		  System.out.println("2nd statment");
		  Assert.assertEquals("1","2");
		  System.out.println("3rd statment");
		
		  //output
		  //1st statment
		  //2nd statment
		  //fail the result
	  }
	
}
