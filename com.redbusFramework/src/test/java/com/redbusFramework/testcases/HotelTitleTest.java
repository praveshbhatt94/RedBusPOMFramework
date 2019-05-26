package com.redbusFramework.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbusFramework.base.TestBase;
import com.redbusFramework.pages.HomePage;
import com.redbusFramework.pages.HotelPage;
import com.redbusFramework.pages.LoginPage;
import com.redbusFramework.pages.RPoolPage;
import com.redbusFramework.pages.SearchBusPage;
import com.redbusFramework.util.TestUtil;



public class HotelTitleTest extends TestBase {
	
	TestUtil testUtil;
	HomePage homePage;
	HotelPage hotelPage;
	
	public HotelTitleTest(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		//testUtil = new TestUtil();
		homePage = new HomePage();
		hotelPage = new HotelPage();
		//TestUtil.runTimeInfo("error", "Title Verifyed successful");
		//testUtil.switchToFrame();
		
	}
	
	@Test
	public void verifyogin() {
		homePage.navigateHotelPage();
		Assert.assertEquals(hotelPage.verifyHotelPageTitle(), "Online Hotel Booking: Budget & Luxury Star Hotels in India – red:Hotel");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
