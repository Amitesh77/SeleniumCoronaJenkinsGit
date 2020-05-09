package CoronaSelenium.SeleniumInCorona;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base 
{
	
	public RemoteWebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver() throws IOException
	{
		FileInputStream file=new FileInputStream("/Users/568650/git/corona/SeleniumInCorona/src/main/java/Resources/data.properties");
		 prop=new Properties();
		
		prop.load(file);
		
		//String browsername=prop.getProperty("browser");
		
		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		
			
			driver=new RemoteWebDriver(url,cap);
		
		
		
		
		return driver;
	}
	
	public void getScreenshot(String name) throws IOException
	{
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("/Users/568650/Documents/Selenium/SeleniumInCorona/Screenshots/"+name+"screenshot.png"));
	}
}
