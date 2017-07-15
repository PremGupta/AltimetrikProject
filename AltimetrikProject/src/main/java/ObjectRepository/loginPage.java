package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage{
	
	public static WebDriver driver;

	   By emailId=By.id("email");
	   By password=By.id("pass");
	   By loginButton=By.xpath("//input[@value'Log In']");
	   
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
   public  WebElement EmailId()
   {
	   return driver.findElement(emailId);
   }
   
   public WebElement Password()
   {
	   return driver.findElement(password);
   }
   
   public WebElement LoginButton()
   {
	   return driver.findElement(loginButton);
   }
	
}
