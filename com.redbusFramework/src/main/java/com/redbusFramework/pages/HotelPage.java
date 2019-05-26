package com.redbusFramework.pages;

import org.openqa.selenium.support.PageFactory;


import com.redbusFramework.base.TestBase;

public class HotelPage extends TestBase {
		
	
	public HotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHotelPageTitle() {
		String hotelPageTitle = driver.getTitle();
		return hotelPageTitle;
		
	}
	

	

	

}
