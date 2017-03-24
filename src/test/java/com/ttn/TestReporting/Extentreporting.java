package com.ttn.TestReporting;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


import org.testng.Assert;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.LogStatus;

public class Extentreporting{
	
	// private ExtentReports extent = ExtentReports.get(Extentreporting.class);
	 
	ExtentReports extent;
	ExtentTest test; 
	
	// test case 1
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }
	
	
	
		/*

	 	@BeforeSuite
	    public void beforeSuite() {
	       System.out.println("in beforeSuite");

	       extent = new ExtentReports("D://APIReport", true);
	    }
	
	 	@BeforeMethod
	    public void beforeMethod() {
	       System.out.println("in beforeMethod");
	    }
	 
	 	@BeforeClass
	    public void beforeClass() {
	       System.out.println("in beforeClass");
	    }
	 	
	 	@BeforeTest
	    public void beforeTest() {
	       System.out.println("in beforeTest");
	       test = extent.startTest("Test Name", "Sample description");
	    }
	 	
	 
	    @Test
	    public void testOne() {
		 	//ExtentTest test = extent.startTest("Test Name", "Sample description");
	    	System.out.println("Test1");
	    	test.log(LogStatus.PASS, "Details");
	    	test.log(LogStatus.ERROR, "Details");

	    }
	    
	    @Test
	    public void testTwo() {
	    	//ExtentTest test = extent.startTest("Test Name", "Sample description");
	    	System.out.println("Test2");
	    	test.log(LogStatus.PASS, "Details");
	    	test.log(LogStatus.ERROR, "Details");
	    }
	    
	   

	    @AfterMethod
	    public void afterMethod() {
	       System.out.println("in afterMethod");
	    }


	    @AfterClass
	    public void afterClass() {
	       System.out.println("in afterClass");
	    }

	    

	    @AfterTest
	    public void afterTest() {
	       System.out.println("in afterTest");
	       extent.endTest(test);
	       
	    }

	   

	    @AfterSuite
	    public void afterSuite() {
	       System.out.println("in afterSuite");
	       extent.flush();
	    }
	    
	    */
	    
	}
	 
