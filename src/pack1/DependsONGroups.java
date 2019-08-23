package pack1;

import org.testng.annotations.Test;

public class DependsONGroups {
	@Test 
	(dependsOnGroups= {"Car"})
	  public void f2() {
		  System.out.println("2 is dependent on car");
		  
		  
	  }
	  
	  @Test (groups= {"Car"})
	  public void f() {
		  System.out.println("I am car group");
		  
		  
	  }
	  @Test
	  public void f3() {
		  System.out.println("3 is independent");
		  
		  
	  }
}
