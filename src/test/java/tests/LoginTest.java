package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
  @Test
  public void validateLogin() {
	  
	    
	  LoginPage loginpage = new LoginPage(driver); //Make an object of the LoginPage class
	  
	  loginpage.enterUsername();
	  loginpage.enterPassword();
	 // loginpage.clickLoginButton();
	  Assert.assertEquals(TestData.expectedURL , driver.getCurrentUrl());
	  
	  
  }
  
}
