package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	
	private static ExtentReports extent;
    private static ExtentTest test;
    public static ExtentReports getExtentReport() {
        if (extent == null) {
            String reportPath = "D:\\EclipseWorkspace\\Framework_TricitySelenium\\Reports\\"+ "ExtentReport_" + ".html";
 
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }
    
    
    public static ExtentTest startTest(String testName) {
        test = getExtentReport().createTest(testName);
        return test;
    }
    
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
 
  }

}


/* Whenever we generate reports, we only need to create ExtentReportUtility and add @BeforeSuite, @AfterSuite,
 @BeforeMethod and @AfterMethod in the BaseTest class. */
