package com.redbusFramework.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbusFramework.base.TestBase;
import com.redbusFramework.pages.HomePage;
import com.redbusFramework.pages.LoginPage;
import com.redbusFramework.pages.RPoolPage;
import com.redbusFramework.pages.SearchBusPage;
import com.redbusFramework.util.TestUtil;



public class RPoolTitleTest extends TestBase {
	
	TestUtil testUtil;
	HomePage homePage;
	RPoolPage rPoolPage;
	
	public RPoolTitleTest(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		//testUtil = new TestUtil();
		homePage = new HomePage();
		rPoolPage = new RPoolPage();
		//TestUtil.runTimeInfo("error", "Title Verifyed successful");
		//testUtil.switchToFrame();
		
	}
	
	@Test
	public void verifyogin() {
		homePage.navigateRpoolPage();
		Assert.assertEquals(rPoolPage.verifyRPoolPageTitle(), "rPool - Carpool App | Use the new redBus carpooling app.");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
