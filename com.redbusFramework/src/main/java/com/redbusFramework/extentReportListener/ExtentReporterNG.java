/**
 * @author aswani.kumar.avilala
 */
package com.redbusFramework.extentReportListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.redbusFramework.base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentReporterNG extends TestBase implements ITestListener {
 //protected static WebDriver driver;
 protected static ExtentReports reports;
 protected static ExtentTest test;
 public void onTestStart(ITestResult result) {
  System.out.println("on test start");
  test = reports.startTest(result.getMethod().getMethodName());
  test.log(LogStatus.INFO, result.getMethod().getMethodName() + " test is started");
 }
 public void onTestSuccess(ITestResult result) {
  System.out.println("on test success");
  test.log(LogStatus.PASS, result.getMethod().getMethodName() + " test is passed");
 }
 public void onTestFailure(ITestResult result) {
	
		
		  System.out.println("on test failure"); test.log(LogStatus.FAIL,
		  result.getMethod().getMethodName() + " test is failed"); TakesScreenshot ts =
		  (TakesScreenshot) driver; File src = ts.getScreenshotAs(OutputType.FILE); try
		  { String destination = System.getProperty("user.dir") + "/Screenshots/" +
		  result.getMethod().getMethodName() + "FailedScreen.png"; File
		  finalDestination = new File(destination); FileUtils.copyFile(src,
		  finalDestination);
		  FileUtils.copyFile(src, new
		  File(System.getProperty("user.dir")+"/Screenshots/" +
		  result.getMethod().getMethodName() + "FailedScreen.png")); String file =
		  test.addScreenCapture(destination); test.log(LogStatus.FAIL,
		  result.getMethod().getMethodName() + "test is failed", file);
		  test.log(LogStatus.FAIL, result.getMethod().getMethodName() +
		  "test is failed", result.getThrowable().getMessage()); } catch (IOException
		  e) { e.printStackTrace(); }
		 
 }
 public void onTestSkipped(ITestResult result) {
  System.out.println("on test skipped");
  test.log(LogStatus.SKIP, result.getMethod().getMethodName() + " test is skipped");
 }
 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
  System.out.println("on test sucess within percentage");
 }
 public void onStart(ITestContext context) {
	 Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
  System.out.println("on start");
  //driver = new ChromeDriver(); // Set the drivers path in environment variables to avoid code(System.setProperty())
  reports = new ExtentReports(System.getProperty("user.dir") +"/Report/ExtentReport_" + formater.format(calendar.getTime()) +".html", true);
 }
 public void onFinish(ITestContext context) {
  System.out.println("on finish");
  //driver.close();
  reports.endTest(test);
  reports.flush();
 }
}


