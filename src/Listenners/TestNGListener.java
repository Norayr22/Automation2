package Listenners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {

		
	}

	@Override
	public void onStart(ITestContext result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCase is failed and details are "+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase is skiped and details are "+result.getName());
	
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase is started and details are "+result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase is passed and details are "+result.getName());
		
		
	}

}
