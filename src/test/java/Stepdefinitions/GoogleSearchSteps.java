package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps
{
	WebDriver driver=null;
	
	@Given("browser is opened")
	public void browser_is_opened() 
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() 
	{
		driver.get("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() 
	{
	    driver.findElement(By.name("q")).sendKeys("abcd");
	}

	@And("hits enter")
	public void hits_enter() 
	{
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() 
	{
	    driver.getTitle().contains("abcd");
	    driver.close();
	    driver.quit();
	}
	
	@When("user clicks store link")
	public void user_clicks_store_link()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Store')]")).click();
	}
	
	@Then("user is navigated to store page")
	public void user_is_navigated_to_store_page()
	{
		driver.getTitle().equals("Google Store for Google Made Devices &amp; Accessories");
		driver.close();
		driver.quit();
	}
}
