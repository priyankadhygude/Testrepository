package keyword;

import org.testng.annotations.Test;

public class Groups2 {
  @Test(groups="smoke")
  public void t22() 
  {
	  System.out.println("third smoke");
  }
  
  @Test(groups="smoke")
  public void t23()
  {
	  System.out.println("fourt smoke");
  }
  @Test(groups="regression")
  public void t24()
  {  
	  System.out.println("second regression");
  }
  
  
  
}
