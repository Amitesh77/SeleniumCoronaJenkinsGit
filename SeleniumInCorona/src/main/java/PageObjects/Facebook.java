package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebook {
	
	public RemoteWebDriver driver;

	public Facebook(WebDriver driver) {
		
		this.driver = (RemoteWebDriver) driver;
	}
	
	
	By highlight=By.xpath("//span[text()='Create an account']");
	
	By link=By.tagName("a");
	
	
	
	public WebElement textHighlight()
	{
		return driver.findElement(highlight);
	}
	
	public List<WebElement> brokenlinks()
	{
		return driver.findElements(link);
	}
	
	

}
