package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class HandleCalenderUtils extends BaseClass{

	
	public static void selectMonthYear(WebElement monthYear, WebElement next, String expectedMonthYear )
	{
		while(true)
		{
			
			String actualMonthYear = monthYear.getText();
			if(actualMonthYear.equalsIgnoreCase(expectedMonthYear))
			{
				break;
				
			}
			else
			{
				next.click();
				
			}
			
		}
	
	}
	
	public static void selectDate(List<WebElement> listDate, String expectedDate)
	{
		
		for(WebElement dt : listDate)
		{
			String actualDate = dt.getText();
			if(actualDate.equals(expectedDate))
			{
				dt.click();
				break;
			}
		}
		
	}
	
	
	public static void selectTime(List<WebElement> listTime, String expectedTime)
	{
		
		for(WebElement tm :listTime)
		{
			String actualTime = tm.getText();
			if(actualTime.equalsIgnoreCase(expectedTime))
			{
				tm.click();
				break;
			}
		}
		
	}
	
	
	
	
}
