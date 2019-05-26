package com.redbusFramework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redbusFramework.base.TestBase;

public class SearchBusPage extends TestBase {
	
	
	@FindBy (xpath = "//div[contains(text(),'View Seats')]")
	WebElement viewSeatsBtn;

	
	
	public SearchBusPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public static String verifySearchPageTitle() {
		String searchBusPageTitle = driver.getTitle();
		return searchBusPageTitle;
		
	}
	

	

	

}
