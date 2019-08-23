package pack1;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
  
  @Test(dependsOnMethods= {"f"})
  public void f2() {
	  System.out.println("2 is dependent on 1");
	  
	  
  }
  
  @Test
  public void f() {
	  System.out.println("1");
	  
	  
  }
  @Test(dependsOnMethods= {"f2"})
  public void f3() {
	  System.out.println("3 is dependent on 2");
	  
	  
  }
  
}
