package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");
	
	By pass = By.xpath("//input[@id='user_password']");
	
	By login = By.xpath("//input[@type='submit']");
	
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(pass);
	}
	
	public WebElement getLoginUser()
	{
		return driver.findElement(login);
	}
	
	
}
