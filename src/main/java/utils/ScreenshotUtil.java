package utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	public static String takeScreenshot(WebDriver driver, String testName) throws IOException 

	{

        Random r1 = new Random();

        int randomNumber = r1.nextInt(1000, 9999);

        String screenshotPath = "D:\\EclipseWorkspace\\Framework_TricitySelenium\\Screenshots\\" + testName + "_" + randomNumber + ".png";
 
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File(screenshotPath);
 
        FileUtils.copyFile(srcFile, destFile);
        
        

        return screenshotPath;

    }

 

}
