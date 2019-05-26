package com.redbusFramework.pages;

import org.openqa.selenium.support.PageFactory;


import com.redbusFramework.base.TestBase;

public class RPoolPage extends TestBase {
		
	
	public RPoolPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyRPoolPageTitle() {
		String rPoolPageTitle = driver.getTitle();
		return rPoolPageTitle;
		
	}
	

	

	

}
