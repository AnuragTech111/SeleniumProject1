package myacademy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingHomePage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginTest2 extends Base{
	
	private static Logger log=LogManager.getLogger(LoginTest2.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=driverInitialization();
		// driver.get("https://rahulshettyacademy.com/#/index");
		driver.get(prop.getProperty("login_page_url"));
		log.info("Login Page is displayed successfully");
	}

	
	@Test
	public void loginByMultipleDataset() throws IOException
	{
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getEmail().sendKeys("rohit123@gmail.com");
		loginpage.getPassword().sendKeys("112233");
		loginpage.getLoginUser().click();
		log.debug("User clicked on Login button");
	
	}
	
	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		driver=null;
	}
	
	
	
	/*
	 
	@Test(dataProvider="getData")
	public void loginByMultipleDataset(String email,String pass,String text) throws IOException
	{
		driver=driverInitialization();
		// driver.get("https://rahulshettyacademy.com/#/index");
		driver.get(prop.getProperty("login_page_url"));
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getEmail().sendKeys(email);
		loginpage.getPassword().sendKeys(pass);
		System.out.println(text);
		loginpage.getLoginUser().click();
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		
		data[0][1]="jay111@gmail.com";
		data[0][2]="111";
		data[0][3]="Restricted User";
		
		data[0][1]="john222@gmail.com";
		data[0][2]="222";
		data[0][3]="Non-Restricted User";
		
		return data;
		
	}
	
	*/////////////////////////////////////////

}
