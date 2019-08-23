package pack1;

import org.testng.annotations.Test;

public class PrioritisingAndSequencingExample {
	@Test 
	(enabled=false)
	  public void f2() {
		  System.out.println("enabled=false functionality");
		  
		  
	  }
	  
	  @Test (priority = 1)
	  public void f() {
		  System.out.println("1 priority");
		  
		  
	  }
	  @Test(priority = 0,enabled=true)
	  public void f3() {
		  System.out.println("0 priority");
		  }
}
