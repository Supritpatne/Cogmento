package utilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;

public class WebElementUtils extends BaseClass{

	
	public static void sendKeys(WebElement wb, String expectedValue)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(expectedValue);
		
		
	}
	
	public static void click(WebElement wb)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
		
		
		
	}
	
	
	
	
	
	
	
}
