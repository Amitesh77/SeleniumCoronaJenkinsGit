package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	
	public WebDriver driver;

	public Facebook(WebDriver driver) {
		
		this.driver = driver;
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
