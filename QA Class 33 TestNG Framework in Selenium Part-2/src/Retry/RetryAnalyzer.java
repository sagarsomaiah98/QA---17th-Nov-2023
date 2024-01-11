package Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int limit=2;//number of time you want run your test

	@Override
	public boolean retry(ITestResult result) {
		
		if(count<limit) {
			count++;
			return true;
		
		}
		return false;
	}

}
