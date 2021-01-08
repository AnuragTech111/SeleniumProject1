package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingHomePage {
	
	public LandingHomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebDriver driver;
	
	//By login = By.xpath("//a[text()='Login']");
	By login = By.xpath("html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a");
	
	By title = By.xpath("/html/body/app-root/div/app-home/div/section[2]/div[1]/div[1]/div[1]/h2");
	
	By register = By.xpath("//a[text()='Register']");
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getTitleCourse()
	{
		return driver.findElement(title);
	}
	
	public WebElement getRegisterLink()
	{
		return driver.findElement(register);
	}
}
