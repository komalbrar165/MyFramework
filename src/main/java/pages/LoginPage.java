package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//Constructor of the class
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//PageFactory is predefined java class
											   // Here we are initializing the elements
		
	}
	
	
	//All Elements of the page
	@FindBy(id="user-name") 
	WebElement usernamefield;
	
	@FindBy(id="password")
	WebElement passwordfield;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	//Actions/Methods of the page	
	public void enterUsername()
	{
		usernamefield.sendKeys("standard_user");
	}
	
	public void enterPassword()
	{
		passwordfield.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	
	

}
