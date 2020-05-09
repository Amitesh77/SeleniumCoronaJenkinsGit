package CoronaSelenium.SeleniumInCorona;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Facebook;

public class Demo2 extends Base{
	
	@BeforeTest
	public void getHome() throws IOException
	{
		driver=(RemoteWebDriver) initDriver();
	}
	
	@Test
	public void highLightText()
	{
		driver.get(prop.getProperty("url1"));
		
		System.out.println(driver.getTitle());
		
		
	}
	
	
	@Test 
	public void findbrokenLinks() throws MalformedURLException, IOException
	{
		driver.get(prop.getProperty("url2"));
		System.out.println(driver.getTitle());

		}

}
