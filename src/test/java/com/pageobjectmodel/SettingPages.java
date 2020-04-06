package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPages {
public WebDriver driver;
	
	public SettingPages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

	@FindBy (xpath="//input[@id='login-user']")
	WebElement userField;


	public WebElement getUserField() {
		return userField;
	
	}

	@FindBy (xpath="//input[@id='login-pass']")
	WebElement password;
	
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy (xpath="//button[@type='submit']")
	 WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy (xpath="//span[contains(text(),'Settings')]")
	public WebElement settingButton;
	
	public WebElement getSettingButton() {
		return settingButton;
	}
	@FindBy (xpath="//section[2]//p[1]//input[1]")
	WebElement passwordField;
	
	
	
	public WebElement getPasswordField() {
		return passwordField;
	
	}

	@FindBy (xpath="//section[3]//p[1]//input[1]")
	WebElement verifyField;
	
	
	
	public WebElement getVerifyField() {
		return verifyField;
	
	}
	
	@FindBy (xpath="(//input[@class='input'])[4]")
	WebElement usernameField;
	

	public WebElement getUsernameField() {
		return usernameField;
	
	}
	@FindBy (xpath="//span[contains(text(),'Save Changes')]")
	WebElement saveField;

	public WebElement getSaveField() {
		return saveField;
	
	}
	
	
}
