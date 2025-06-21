package base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ExtentReportUtility;
import utils.ScreenshotUtil;

public class BaseTest {
	
    protected  WebDriver driver;
    protected ExtentTest test;
    
    
    
	@BeforeSuite
	public void startReport() 
	
	{
		ExtentReportUtility.getExtentReport();
	}
	
	
	
	
	@BeforeTest
	public void setup() throws IOException
	
	{
		
		  //WebDriverManager.chromedriver().setup();
		  //driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //driver.get("https://www.saucedemo.com/");
		
		   
		  
		  ConfigReader.readConfig();
		  String browser = ConfigReader.getBrwoser(); // Here browser mean chrome browser
		  driver = DriverFactory.initDriver(browser);
		  driver.get(ConfigReader.getURL());
		  
		
		
	}
	
	
	@BeforeMethod
	public void createTest(Method method) 
	
	{
		test = ExtentReportUtility.startTest(method.getName());
	}
	
	
	
	
	@AfterMethod
    public void tearDown(ITestResult result) throws IOException 

	{

		if (result.getStatus() == ITestResult.SUCCESS) 

        {


            test.log(Status.PASS, result.getName() + " is passed");

        }

        if (ITestResult.FAILURE == result.getStatus()) 

        {

            
            test.log(Status.FAIL, result.getName() + " is failed");
            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getName());
            test.addScreenCaptureFromPath(screenshotPath); //Add screenshot to report

        }

    }
	
	
	
	@AfterSuite
	public void EndReport() {
		
		ExtentReportUtility.flushReport();
	}
 

}
