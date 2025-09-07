package testLayer;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.LoginPage;

public class LoginPageTest extends BaseClass{

	
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
		
	}
	
	@Test
	public void validateLoginFunctionality()
	{
		
	LoginPage loginpage = new LoginPage();
	
	loginpage.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");	
	
	}
//	
//	@AfterTest
//	public void terminateWindow() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		
//		driver.quit();
//		
//		
//	}
	
	
}
