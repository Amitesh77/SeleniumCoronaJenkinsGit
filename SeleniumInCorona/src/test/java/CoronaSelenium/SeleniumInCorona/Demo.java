package CoronaSelenium.SeleniumInCorona;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Facebook;

public class Demo extends Base{
	
	@BeforeTest
	public void getHome() throws IOException
	{
		driver=initDriver();
	}
	
	@Test
	public void highLightText()
	{
		driver.get(prop.getProperty("url"));
		
		Facebook fb=new Facebook(driver);
		
		WebElement high=fb.textHighlight();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');", high);
		
		
	}
	
	
	@Test 
	public void findbrokenLinks() throws MalformedURLException, IOException
	{
		driver.get(prop.getProperty("url"));
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : links) {
			
			String url=webElement.getAttribute("href");
			
			try
			{
				HttpURLConnection conn=(HttpURLConnection)(new URL(url).openConnection());
				conn.connect();
				
				System.out.println(url+" :  "+conn.getResponseCode());
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}
		
		
			
			
		
		
		
	}

}
