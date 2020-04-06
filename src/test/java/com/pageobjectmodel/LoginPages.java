package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
	WebDriver driver;
	
	public LoginPages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//input[@id='login-user']")
	WebElement usernameField;
	
	
	public WebElement getUsernameField() {
		return usernameField;
	
	}

	@FindBy (xpath="//input[@id='login-pass']")
	WebElement passwordField;
	
	
	public WebElement getPasswordField() {
		return passwordField;
	}

	@FindBy (xpath="//button[@type='submit']")
	 WebElement loginField;

	public WebElement getLoginField() {
		return loginField;
	}	
}
