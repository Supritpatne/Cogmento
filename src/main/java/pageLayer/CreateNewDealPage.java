package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.HandleCalenderUtils;
import utilityLayer.WebElementUtils;

public class CreateNewDealPage extends BaseClass{

	@FindBy(name="title")
	WebElement title;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save;
	
	@FindBy(name="description")
	WebElement description;
	
	@FindBy(name="commission")
	WebElement usd;
	
	@FindBy(xpath="//div[@class='react-datepicker__input-container']/child::input")
	WebElement closeDate;
	
	@FindBy(xpath="//div[@class='react-datepicker__current-month']")
	WebElement monthYear;
	
	
	@FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")
	WebElement Next;
	
	@FindBy(xpath="//div[contains(@class,'react-datepicker__day react-datepicker__day') and not(contains(@class,'outside-month'))]")
	List<WebElement> dateValues;
	
	
	@FindBys(@FindBy (xpath="//li[@class='react-datepicker__time-list-item ']"))
	List<WebElement> timeValues;
	
	public CreateNewDealPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void newDealFunctionality(String Title)
	{
		
		WebElementUtils.sendKeys(title, Title);
		WebElementUtils.click(save);
		
	}
	
	public void newDealFunctionality(String Title, String explanation) 
	{
		WebElementUtils.sendKeys(title, Title);
	
		WebElementUtils.sendKeys(description, explanation);
		WebElementUtils.click(save);
		
	}
	
	
	public void newDealFunctionality(String Title, String explanation,String commission) 
	{
		WebElementUtils.sendKeys(title, Title);
	
		WebElementUtils.sendKeys(description, explanation);
		
		WebElementUtils.sendKeys(usd, commission);
		
		WebElementUtils.click(save);
		
	}
	
	
	public void newDealFunctionality(String Title, String explanation,String commission, String expectedMonthYear,  String expectedDate,String expectedTime) 
	{
		WebElementUtils.sendKeys(title, Title);
	
		WebElementUtils.sendKeys(description, explanation);
		
		WebElementUtils.sendKeys(usd, commission);
		WebElementUtils.click(closeDate);
		
		HandleCalenderUtils.selectMonthYear(monthYear, Next, expectedMonthYear);
		HandleCalenderUtils.selectDate(dateValues, expectedDate);
		HandleCalenderUtils.selectTime(timeValues, expectedTime);
		
		WebElementUtils.click(save);
		
	}
	

	
}
