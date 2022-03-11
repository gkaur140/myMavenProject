package com.mymavenproject.RetryLogic;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.mymavenproject.testbase.BaseTest;

public class RetryLogic extends BaseTest implements IRetryAnalyzer {

	int cnt = 0;

	int maxCnt = 1;

	@Override
	public boolean retry(ITestResult result) {
		logger.info("Retrying failed test cases " + result.getMethod().getMethodName());

		if (cnt < maxCnt) {
			cnt++;
			return true;
		}
		return false;

	}

}
