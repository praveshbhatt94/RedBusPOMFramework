package com.redbusFramework.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbusFramework.base.TestBase;
import com.redbusFramework.pages.HomePage;
import com.redbusFramework.util.TestUtil;



public class HomePageTitleTest2 extends TestBase {
	
	TestUtil testUtil;
	HomePage homePage;
	
	public HomePageTitleTest2(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		//testUtil = new TestUtil();
		homePage = new HomePage();
		//TestUtil.runTimeInfo("error", "Title Verifyed successful");
		//testUtil.switchToFrame();
		
	}
	
	@Test
	public void verifyHomePageTitle() {
		Assert.assertEquals(homePage.verifyHomePageTitle(), "Boo Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
