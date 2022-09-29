package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//loginPageFactory class for LoginDemoSteps_PF in src/test/java/Stepdefinitions
public class TestProjectDemoLoginPageFactory 
{
	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txt_password;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;
	
	WebDriver driver;
	
	public TestProjectDemoLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//will initialize the elements
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
