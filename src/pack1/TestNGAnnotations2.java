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

public class TestNGAnnotations2 {
  @Test
 public void f() {
	  System.out.println("2 : @Test");
  }
  
  @Test
  public void f2() {
 	  System.out.println("2 : @Test2");
   }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2:  @BeforeMethod"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("2 : @AfterMethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("2::::::: @BeforeClass");
  }
@AfterClass
  public void afterClass() {
	  System.out.println("2:::: @AfterClass");
  }

}
