package com.redbusFramework.pages;

import java.sql.Driver;
import java.util.List;

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

	
	@FindBy(xpath="//div[@id='signInView']//div[@class='signin-screen']")
	WebElement signInEmailLink;
	
	@FindBy(id="email-mobile")
	 WebElement email;
	
	@FindBy(id="password")
	 WebElement password;
	
	
	@FindBy(id="doSignin")
	 WebElement loginBtn;
	
	@FindBy(xpath="//div/div[contains(text(), 'Either the Email id')]")
	 WebElement errorLoginMSG;
	
	
	public String signInForm(String emailID, String pass) throws InterruptedException {
		//mobile.c
		String s = "";
		Thread.sleep(4000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class='modalIframe']"))));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		signInEmailLink.click();
		Thread.sleep(2000);
		email.sendKeys(emailID);
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		s = driver.findElements(By.xpath("//div/div[contains(text(), 'Either the Email id')]")).get(0).getText();
		/*
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//iframe[@class='modalIframe']"))); Thread.sleep(2000); s =
		 * errorLoginMSG.getText();
		 */
		return s;
	}
	
}
