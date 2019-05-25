package com.redbusFramework.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redbusFramework.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//div[@id='signInView']//div[@class='social FC DIB active ']/div[@class='signin-screen']")
	WebElement signInEmailLink;
	
	@FindBy(id="email-mobile")
	 WebElement email;
	
	@FindBy(id="password")
	 WebElement password;
	
	
	
	@FindBy(id="doSignin")
	 WebElement loginBtn;
	
	
	public void signInForm(String emailID, String pass) throws InterruptedException {
		//mobile.c
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", "//div[@id='signInView']//div[@class='social FC DIB active ']//div[@class='signin-screen']");
		signInEmailLink.click();
		email.sendKeys(emailID);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
}
