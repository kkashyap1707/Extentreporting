package com.ttn.Test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SampleTest extends ExtentreportingTest{
	
	
	@Test()
	public void ads() throws InterruptedException{
		
		System.out.println("Keshav");
		test.log(LogStatus.PASS, "Keshav");
	}
	
	
}