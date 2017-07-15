package AltimetrikPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.loginPage;
//import Resources.base;

public class loginPageTestCases  {
 
	public static WebDriver driver;
	
/*@BeforeTest
public static void initializeBrowser() throws IOException
{
	driver=browseropen();
}*/
	
@Test(dataProvider="getData")
public void loginPageTestCases(String email, String pass) throws IOException
{

	/*Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Prem\\AltimetrikProject\\AltimetrikProject\\src\\main\\java\\Resources\\data.properties");
	prop.load(file);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\Downloads\\Study\\Selenium Files\\Zip Files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
   System.out.println("Chrome browser launched");
	prop.getProperty("url");*/
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\Downloads\\Study\\Selenium Files\\Zip Files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	loginPage lp=new loginPage(driver);
	
	lp.EmailId().sendKeys(email);
	lp.Password().sendKeys(pass);
	lp.LoginButton().click();
	
}

/*	@AfterTest
	public void closebrowser()
	{
		driver.close();
		driver=null;
	}*/
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="prem2604@gmail.com";
		data[0][1]="test123";
		return data;
	}

}
