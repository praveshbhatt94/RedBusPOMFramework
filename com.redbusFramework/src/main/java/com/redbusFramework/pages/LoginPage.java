package com.redbusFramework.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbusFramework.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//div[contains(text(),'SIGN IN using Email')])[2]")
	WebElement signInEmailLink;
	
	@FindBy(id="email-mobile")
	 WebElement email;
	
	@FindBy(id="password")
	 WebElement password;
	
	
	
	@FindBy(id="doSignin")
	 WebElement loginBtn;
	
	
	public void signInForm(String emailID, String pass) {
		//mobile.c
		signInEmailLink.click();
		email.sendKeys(emailID);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
}
