package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	
	//Step 1 Constructor
	public ProductListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Step 2 elements by @FindBy	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addtocartbutton;
	
	@FindBy(className="shopping_cart_link")
	WebElement carticon;
	
	
	//actions/methods
	public void clickAddToCartButton()
	{
		addtocartbutton.click();
	}
	
	public void clickCartIcon()
	{
		carticon.click();
	}
	
	
	

}
