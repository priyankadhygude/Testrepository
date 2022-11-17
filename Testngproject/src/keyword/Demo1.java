package keyword;

import org.testng.annotations.Test;

public class Demo1 {
	
	//A-Z  a-z
	@Test(priority=-1)
	public void login1()
	{
		System.out.println("login test case");
	}
	
	@Test(priority=2)
	public void login2()
	
	{
		System.out.println("abc test case");
	}
	@Test(priority=0)
	public void login3()
	{
		System.out.println("This is demo test");
	}
	
		
	
}
	
	
	
	


