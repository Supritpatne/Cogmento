package utilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerUtils implements ITestListener{

	ExtentTest extentTest ;
	
	public void onTestStart(ITestResult result) {
	
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test is Start " +methodName);
		
		 extentTest = extentreports.createTest(methodName);
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test is Pass " +methodName);
		
		extentTest.log(Status.PASS, methodName);
		
		try {
			extentTest.addScreenCaptureFromPath(ScreenShotUtils.takeScreenShot("PassScreenShot", methodName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test is Fail " +methodName);
		
		extentTest.log(Status.FAIL, methodName);
		
		try {
			extentTest.addScreenCaptureFromPath(ScreenShotUtils.takeScreenShot("FailScreenshot", methodName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test is Skip " +methodName);
		
		extentTest.log(Status.SKIP, methodName);
		
	}

	
	ExtentReports extentreports;
	
	public void onStart(ITestContext context) {
		
		String suiteName = context.getSuite().getName();
		System.out.println("Suite is started "+suiteName);
		
		 extentreports = new ExtentReports();
		
		 String currentYear = ScreenShotUtils.captureDateFormat("yyyy");
			
			String currentMonthYear = ScreenShotUtils.captureDateFormat("MMMyyyy");
			
			String currentDateMonthYear = ScreenShotUtils.captureDateFormat("ddMMMyyyy");
			
			String currentDateTime = ScreenShotUtils.captureDateFormat("ddMMMyyyy_HHmmss");
		 		
			String path = System.getProperty("user.dir")+"//ExtentReports//"+currentYear+"//"+currentMonthYear+"//"+currentDateMonthYear+"//"+currentDateMonthYear+"//" +suiteName+currentDateTime+".html";     
			
		ExtentSparkReporter extenetSparkLocator = new ExtentSparkReporter(path);
		
		extentreports.attachReporter(extenetSparkLocator);
		
	}

	public void onFinish(ITestContext context)
	{
		
		String suiteName = context.getSuite().getName();
		System.out.println("Suite is Completed "+suiteName);
		
	}

	
	
	
	
	
	
}
