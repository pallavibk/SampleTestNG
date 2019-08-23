package pack1;

import org.testng.annotations.Test;

public class InvocationCountTestExample {
  @Test(invocationCount=5)
  public void f() {
	  System.out.println("test");
  }
}
