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
import com.redbusFramework.util.TestUtil;



public class LoginTest extends TestBase {
	
	TestUtil testUtil;
	HomePage homePage;
	LoginPage loginPage;
	
	public LoginTest(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		//testUtil = new TestUtil();
		homePage = new HomePage();
		loginPage = new LoginPage();
		//TestUtil.runTimeInfo("error", "Title Verifyed successful");
		//testUtil.switchToFrame();
		
	}
	
	@Test
	public void verifyHomePageTitle() {
		//Assert.assertEquals(homePage.verifyHomePageTitle(), "Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus");
		homePage.navigateLoginPage();
		loginPage.signInForm("dhikibhatt01@gmail.com", "Dhiki@3182");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
