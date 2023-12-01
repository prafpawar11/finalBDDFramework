package com.UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.BaseLayer.BaseClass;

public class RetryAnalyzerSetUp extends BaseClass implements IRetryAnalyzer{
	
	int counter=0;
	
	int maxRetryLimit=5;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<maxRetryLimit)
		{
			counter++;
		
			return true;
		}
		
		
		return false;
	}

	
	
}
