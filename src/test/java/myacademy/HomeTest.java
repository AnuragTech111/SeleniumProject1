package myacademy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingHomePage;
import pageObjects.LoginPage;
import resources.Base;

public class HomeTest extends Base{
	
	
	private static Logger log=LogManager.getLogger(HomeTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=driverInitialization();
		// driver.get("https://rahulshettyacademy.com/#/index");
//		driver.get(prop.getProperty("home_page_url"));
//		log.info("Home Page is displayed successfully");
		driver.get(prop.getProperty("login_page_url"));
		log.info("Login Page is displayed successfully");
	}

	@Test
	public void baseNavigationLogin() throws IOException
	{
		
		
//		LandingHomePage landingHome=new LandingHomePage(driver);
//		landingHome.getLogin().click();
//		log.info("Login Page is displayed successfully");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getEmail().sendKeys("raj123@gmail.com");
		loginpage.getPassword().sendKeys("raj111");
		loginpage.getLoginUser().click();
		log.debug("User clicked on Login button");
	}
	
	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		driver=null;
	}

}
