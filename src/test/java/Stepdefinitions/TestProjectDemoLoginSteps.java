package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//This is a LoginDemoSteps, feature file is LoginDemo.feature in src/test/resources/Features
public class TestProjectDemoLoginSteps 
{
//	WebDriver driver=null;
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
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login()
//	{
//		driver.findElement(By.id("login")).click();
//	}
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() 
//	{
//	   driver.getPageSource().contains("Community Powered Test Automation");
//	   driver.close();
//	   driver.quit();
//	}
}
