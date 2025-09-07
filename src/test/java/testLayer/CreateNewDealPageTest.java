package testLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.CreateNewDealPage;

public class CreateNewDealPageTest extends BaseClass{

	@Test
	public void validateNewDeal() throws InterruptedException
	{
		
		CreateNewDealPage newdealpage = new CreateNewDealPage();
		
		newdealpage.newDealFunctionality("QA Tester");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		newdealpage.newDealFunctionality("QA Tester", "UI Automation Testet");
		
		Thread.sleep(3000);

		driver.navigate().back();
		
		newdealpage.newDealFunctionality("QA Tester", "UI Automation Testet", "100%");
		
		driver.navigate().to("https://ui.cogmento.com/deals/new");
		
		Thread.sleep(3000);
		
		newdealpage.newDealFunctionality("QA Tester", "UI Automation Testet", "100%","June 2025","11","00:45");
		
		//driver.navigate().to("https://ui.cogmento.com/deals/new");
//		
//		newdealpage.newDealFunctionality2("QA Tester","Automation UI Applicatis", "100%");
//		
//		driver.navigate().to("https://ui.cogmento.com/deals/new");
//		
		
		
		
	}
	
	
}
