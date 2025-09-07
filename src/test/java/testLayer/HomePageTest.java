package testLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.HomePage;

public class HomePageTest extends BaseClass{

	
	@Test
	
	public void validateHomePage()
	{
		
		HomePage homepage= new HomePage();
		
		homepage.homepageFunctionality();
		
	}
	
	
	
	
	
	
}
