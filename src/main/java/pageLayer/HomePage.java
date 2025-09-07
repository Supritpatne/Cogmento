package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementUtils;

public class HomePage extends BaseClass{

	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement deals;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement create;
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void homepageFunctionality()
	{
		
		WebElementUtils.click(deals);
		WebElementUtils.click(create);
		
	}
	
	
	
	
}
