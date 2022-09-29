package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestProjectDemoLoginPage;
//This is a POM version of LoginDemoSteps using By class. The page class is loginPage in src/test/java/pages 
//and feature file is LoginDemo.feature in src/test/resources/Features
public class TestProjectDemoLoginSteps_POM 
{
//	WebDriver driver=null;
//	TestProjectDemoLoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open()
//	{	
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
//	    driver=new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page()
//	{
//		driver.get("https://example.testproject.io/web/");
//	}
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password)
//	{
//		login=new TestProjectDemoLoginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login()
//	{
//		login.clickLogin();
//	}
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() 
//	{
//	   login.checkLogout();
//	   driver.close();
//	   driver.quit();
//	}
}
