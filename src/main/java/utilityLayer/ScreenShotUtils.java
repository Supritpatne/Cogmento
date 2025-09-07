package utilityLayer;

import java.io.File;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;

public class ScreenShotUtils extends BaseClass{

	
	public static String captureDateFormat(String dateFormat)
	{
		
		SimpleDateFormat simple =new SimpleDateFormat(dateFormat);
		
		String currentDate = simple.format(new Date());
		
		return currentDate;
		
		
		
	}
	
	
	
	public static String  takeScreenShot(String folderName, String testCase) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);

		String currentYear = ScreenShotUtils.captureDateFormat("yyyy");
		
		String currentMonthYear = ScreenShotUtils.captureDateFormat("MMMyyyy");
		
		String currentDateMonthYear = ScreenShotUtils.captureDateFormat("ddMMMyyyy");
		
		String currentDateTime = ScreenShotUtils.captureDateFormat("ddMMMyyyy_HHmmss");
		
		
		String  path = System.getProperty("user.dir")+"//Screenshot"+currentYear+"//"+currentMonthYear+"//"+currentDateMonthYear+"//"+folderName+"//"+testCase+currentDateTime+".png";
		
		File dest = new File(path);
		
		FileUtils.copyFile(src, dest);
		
		
		return path;
		
	}
	
	
	
	
	
	
}
