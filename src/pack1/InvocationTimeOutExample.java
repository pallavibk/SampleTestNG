package pack1;

import org.testng.annotations.Test;

public class InvocationTimeOutExample {
  @Test(invocationTimeOut=50)
  public void f() {
	  //infinite loop
	  while(true)
	  {
	  System.out.println("test");
  }
}
}
