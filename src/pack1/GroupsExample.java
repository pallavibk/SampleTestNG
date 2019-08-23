package pack1;

import org.testng.annotations.Test;

public class GroupsExample {

	@Test(groups= {"scotter"})
	 public void f() {
		  System.out.println("@Test-scotter");
	  }
	@Test(groups= {"scotter"})
	 public void ff() {
		  System.out.println("@Test-scotter2");
	  }
	  
	  @Test(groups= {"car"})
	  public void f2() {
	 	  System.out.println("@Test2-car");
	   }
	
}
