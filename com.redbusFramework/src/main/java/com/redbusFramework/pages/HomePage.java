package com.redbusFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbusFramework.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "signin_dd")
	WebElement signInmenu;
	
	@FindBy (id = "signInLink")
	WebElement signInLink;
	
	public static String verifyHomePageTitle() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
		
	}
	
	public void navigateLoginPage() {
		signInmenu.click();
		signInLink.click();
	}
	

}
