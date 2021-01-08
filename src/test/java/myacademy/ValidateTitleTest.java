package myacademy;

import java.io.IOException;

import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingHomePage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitleTest extends Base{
	
	private static Logger log=LogManager.getLogger(ValidateTitleTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=driverInitialization();
		// driver.get("https://rahulshettyacademy.com/#/index");
		driver.get(prop.getProperty("home_page_url"));
		log.info("Home Page is displayed successfully");
	}


	@Test
	public void titleCourseValidation() throws IOException
	{
		
		LandingHomePage landingHome=new LandingHomePage(driver);
		//landingHome.getTitleCourse().getText();
		Assert.assertEquals(landingHome.getTitleCourse().getText(), "Featured Courses");
		log.info("Correct Title is displayed successfully");
		
		//Assert.assertFalse(landingHome.getRegisterLink().isDisplayed());
		//Assert.assertTrue(landingHome.getRegisterLink().isDisplayed());
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		driver=null;
	}

}
