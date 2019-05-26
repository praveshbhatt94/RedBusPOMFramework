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
import com.redbusFramework.pages.SearchBusPage;
import com.redbusFramework.util.TestUtil;



public class SearchBusPageTitleTest extends TestBase {
	
	TestUtil testUtil;
	HomePage homePage;
	SearchBusPage searchBusPage;
	
	public SearchBusPageTitleTest(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		//testUtil = new TestUtil();
		homePage = new HomePage();
		searchBusPage = new SearchBusPage();
		//TestUtil.runTimeInfo("error", "Title Verifyed successful");
		//testUtil.switchToFrame();
		
	}
	
	@Test
	public void verifySearchBusPageTitle() {
		homePage.searchBus("Bangalore", "Chennai");
		Assert.assertEquals(searchBusPage.verifySearchPageTitle(), "Search Bus Tickets");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
