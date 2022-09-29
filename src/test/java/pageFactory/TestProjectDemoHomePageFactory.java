package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectDemoHomePageFactory 
{
	@FindBy(id="logout")
	@CacheLookup
	WebElement btn_logout;
	
	WebDriver driver;
	
	public TestProjectDemoHomePageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//will initialize the elements
	}
	
	public void checkLogout()
	{
		btn_logout.isDisplayed();
	} 
}
