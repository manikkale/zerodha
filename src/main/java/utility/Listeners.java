package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"THE TEST HAS STARTED");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"THE TEST HAS BEEN SUCCESSFULLY COMPLETED");
	}
    public void onTestFailure(ITestResult result) {
    	try {
			Screenshot.screenshot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
