package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.ProductListPage;

public class ProductListTest extends BaseTest {
	  
  @Test
  public void validateProductListPage() throws InterruptedException {
	  
	  	   
      LoginPage loginpage = new LoginPage(driver); // Repeat the steps on login page as well to keep the continuity
	  
	  loginpage.enterUsername();
	  loginpage.enterPassword();
	  loginpage.clickLoginButton();
	  
	  ProductListPage productlistpage = new ProductListPage(driver); // Create object of ProductListPage class
	  Thread.sleep(3000);
	  productlistpage.clickAddToCartButton();
	  productlistpage.clickCartIcon();
	  
	  
	  
  }
}
