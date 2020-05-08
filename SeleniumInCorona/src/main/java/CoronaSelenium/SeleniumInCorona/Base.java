package CoronaSelenium.SeleniumInCorona;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base 
{
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver() throws IOException
	{
		FileInputStream file=new FileInputStream("/Users/568650/Documents/Selenium/SeleniumInCorona/src/main/java/Resources/data.properties");
		 prop=new Properties();
		
		prop.load(file);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/568650/Documents/Selenium/driver/chromedriver");
			
			driver=new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/568650/Documents/Selenium/SeleniumInCorona/SeleniumDriver/chromedriver");
		}
		
		else
		{
			
		}
		
		return driver;
	}
	
	public void getScreenshot(String name) throws IOException
	{
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("/Users/568650/Documents/Selenium/SeleniumInCorona/Screenshots/"+name+"screenshot.png"));
	}
}
