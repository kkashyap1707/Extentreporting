package com.ttn.Test;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentTestInterruptedException;

public class ExtentreportingTest{
	
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentTestInterruptedException testexception;
	
	@BeforeSuite
	public void BeforeSuite(){
		
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		   
		extent = new ExtentReports(workingDir+"/Test_Execution_Report.html", true);
		extent.loadConfig(new File(workingDir+"/extent-config.xml"));
		extent.addSystemInfo("Environment","QA");
		
	}

	@BeforeMethod
	public void BeforeMethod(){
		test = extent.startTest("ASDF");
		test.assignAuthor("Keshav");
		test.assignCategory("Environment","QA");
	}
	
	
	@AfterMethod
	public void AfterMethod(){
		extent.endTest(test);
	}
	
	
	@AfterSuite
	public void AfterSuite(){
		extent.flush();
		extent.close();
	}
}