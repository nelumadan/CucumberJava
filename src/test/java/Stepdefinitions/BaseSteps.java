package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps 
{	
	WebDriver driver;
	
	@Before
	public void browserSetup()
	{
		System.out.println("Iam in Before method");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
	}
	
	@After
	public void browserTeardown()
	{
		System.out.println("Iam in After method");
	}
}
