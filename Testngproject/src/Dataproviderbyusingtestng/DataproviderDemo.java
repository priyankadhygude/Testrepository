package Dataproviderbyusingtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

       public class DataproviderDemo {
       @Test(dataProvider="logindemo")
       public void login(String uname,String pass)
       {System.setProperty("webdriver.chrome.driver","D:\\Priyu\\chrome\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();

	
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

      String expUrl="https://www.saucedemo.com/inventory.html";
 
     WebElement un=driver.findElement(By.xpath("//input[@id='user-name']"));
     WebElement  pwd=driver.findElement(By.xpath("//input[@id='password']"));
     WebElement btn=driver.findElement(By.xpath("//input[@id='login-button']"));
 
    Reporter.log(uname);	
    Reporter.log(pass);	

   un.sendKeys(uname);
   pwd.sendKeys(pass);
   btn.click();

    String actUrl=driver.getCurrentUrl();

    Assert.assertEquals(actUrl,expUrl);

}

   @DataProvider(name="logindemo")
   public Object[][] getData()
    {
	    return new Object[][]
			{	
			   {"standard_user","secret_sauce"},		
			   {"locked_out","secret_sauce"},
			   {"problem_user","secret_sauce"}
			
			};
			
	
   }
	
	


	
	
	
	
	
	
		

}











	
	
	
	
	
	


	
	
	
	
	
	


