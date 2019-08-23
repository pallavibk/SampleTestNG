package pack1;

import org.testng.annotations.Test;

public class ExpectedExceptionExample {
  @Test(expectedExceptions=NumberFormatException.class)
  public void f() {
	  System.out.println("****");
	  String x="10M";
	  System.out.println("x="+x);
	  Integer.parseInt(x);
	  System.out.println("x="+x);
	  System.out.println("****");
	  
	 
}
}
