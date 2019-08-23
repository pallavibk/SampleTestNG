package pack1;

import org.testng.annotations.Test;

public class GroupsExample2 {
	@Test(groups= {"scotter"})
	 public void f() {
		  System.out.println("@Test-Scooty");
	  }
	  
	  @Test(groups= {"cycle"})
	  public void f2() {
	 	  System.out.println("@Test2-cycle");
	   }
}
