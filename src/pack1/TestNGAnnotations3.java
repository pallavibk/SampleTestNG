package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations3 {
  @Test
 public void f() {
	  System.out.println("3 : @Test");
  }
  
  @Test
  public void f2() {
 	  System.out.println("3 : @Test2");
   }
  
 

}
