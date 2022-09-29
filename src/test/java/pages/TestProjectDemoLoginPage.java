package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//loginPage class for LoginDemoSteps_POM in src/test/java/Stepdefinitions
public class TestProjectDemoLoginPage 
{
	WebDriver driver;
	
	By txt_username=By.id("name");
	By txt_password=By.id("password");
	By btn_login = By.id("login");
	By btn_logout=By.id("logout");
	
	public TestProjectDemoLoginPage(WebDriver driver)
	{
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo"))
			{
				throw new IllegalStateException("This is not login page. The current page is : "+driver.getCurrentUrl());
			}
		else System.out.println("You are on login page");
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void checkLogout()
	{
		driver.findElement(btn_logout).isDisplayed();
	}
}
