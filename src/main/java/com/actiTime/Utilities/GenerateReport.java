package com.actiTime.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class GenerateReport extends TestListenerAdapter{
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	public void onStart(ITestContext rv1)
	{
		String date=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String repName="Test-Reports"+date+".html";
		reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//"+repName);
		reporter.config().setDocumentTitle("VTiger Execution Report");
		
		reporter.config().setReportName("Build number 1 result");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA","Gayathri");
		extent.setSystemInfo("Environment","Test Environment");
		extent.setSystemInfo("Application name","VTiger");
		
		extent.setSystemInfo("Platform","windows 7");
		extent.setSystemInfo("Browser","Chrome");
		System.out.println("Batch Execution stsrted.........");
	}
	public void onFinish(ITestContext rv1)
	{
		System.out.println("BatchExecution finished!!!!");
		extent.flush();
		
	}
	public void onTestStart(ITestResult rv1)
	{
		System.out.println("BatchExecution test started......");
	}
	public void onTestSuccess(ITestResult rv1)
	{
		System.out.println("Test scripts is pass....");
		test=extent.createTest(rv1.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("The test is success!!!", ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult rv)
	{
		test=extent.createTest(rv.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("The test is failed", ExtentColor.RED));
		EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
		File f1=efw.getScreenshotAs(OutputType.FILE);
		String date=new SimpleDateFormat("yyy-MM-dd:hh:mm:ss").format(new Date());
	    
		String path=System.getProperty("user.dir")+"//Screenshots//"+date+".jpg";
		File f2=new File(path);
		
			try {
				FileUtils.copyFile(f1,f2);
				System.out.println("Test execution failed & screenshot taken");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("test  failed & screenshot not taken");
				e.printStackTrace();
			}	
		
	}	
		
	public void onTestSkipped(ITestResult rv)
	{
		test=extent.createTest(rv.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("The test is skipped!!!", ExtentColor.ORANGE));
		
		System.out.println("skipped........");
	}

}
