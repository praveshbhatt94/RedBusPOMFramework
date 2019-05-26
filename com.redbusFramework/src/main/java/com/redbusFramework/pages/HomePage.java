package com.redbusFramework.pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.redbusFramework.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "sign-in-icon-down")
	WebElement signInmenu;
	
	@FindBy (id = "src")
	WebElement fromSrc;
	
	@FindBy (id = "dest")
	WebElement toDest;
	
	
	@FindBy (xpath = "//div//label[@for='onward_cal']")
	WebElement onwardCalender;
	
	@FindBy (id = "search_btn")
	WebElement searchbtn;
	
	
	@FindBy (xpath = "//div[@id='rb-calendar_onward_cal']/table[1]/tbody/tr[7]/td[4]")
	WebElement toCalender;
	
	
	@FindBy (xpath = "(//div[@id='search_div']//ul/li)[1]")
	WebElement fromAddress;
	
	@FindBy (xpath = "(//div[@class='fl search-box']//ul/li)[1]")
	WebElement toAddress;
	
	@FindBy (id = "signInLink")
	WebElement signInLink;
	
	@FindBy (xpath = "//a[@title='cars']")
	WebElement rPoolLink;
	
	@FindBy (xpath = "//a[@title='redBus Hotels']")
	WebElement hotelLink;
	
	public static String verifyHomePageTitle() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
		
	}
	
	public  void searchBus(String from, String to) {
		fromSrc.sendKeys(from);
		fromSrc.sendKeys(Keys.TAB);
		fromAddress.click();
		toDest.sendKeys(to);
		toAddress.click();
		onwardCalender.click();
		toCalender.click();
		searchbtn.click();
	}
	
	public void navigateLoginPage() {
		signInmenu.click();
		signInLink.click();
	}
	
	public void navigateRpoolPage() {
		rPoolLink.click();
		
	}
	
	public void navigateHotelPage() {
		hotelLink.click();
		
	}
	

}
