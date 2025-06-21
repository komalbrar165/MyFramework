package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	static Properties property = new Properties(); // Properties is a predefined Java class
	
	public static void readConfig() throws IOException
	
	{
		FileReader fr = new FileReader("D:\\EclipseWorkspace\\Framework_TricitySelenium\\src\\test\\resources\\config.properties");	
		property.load(fr); // loads the properties to fr so that they can be used by the below methods
						// FileReader is also a predefined Java class
		
	}
	
	
	public static String getURL()
	
	{
		return property.getProperty("AppURL"); // return string type and fetches the required date we want from config.properties i.e. AppURL
	}
	
	
	public static String getBrwoser()
	
	{
		return property.getProperty("Browser"); // return string type and fetches the required date we want from config.properties i.e. Browser
	}
	
	
	

}
