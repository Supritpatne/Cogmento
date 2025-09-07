package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementUtils;

public class LoginPage extends BaseClass{

	
	@FindBy(name="email")
	WebElement userName;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void loginFunctionality(String uName, String pass)
	{
		
		WebElementUtils.sendKeys(userName, uName);
		WebElementUtils.sendKeys(password, pass);
		
		WebElementUtils.click(loginButton);
		
	}
	
	
	
	
}
