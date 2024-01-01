package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListerners implements ITestListener {
	
	
	// for automatic implement @Override method > right click on class > source > override / implements method > select 
	
	
  @Override
	public void onTestStart(ITestResult result) {
	  
	  System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("onTestFailedWithTimeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("onStart");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish");
		
	}
	
}
