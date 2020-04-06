package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPages {
WebDriver driver;
	
	public EditPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy (css="div.has-stickynav.is-primary-indigo.is-alternate-blue-grey div.container.is-fluid.has-mkcontent:nth-child(1) div.columns.is-gapless div.column.is-narrow.is-hidden-touch.sidebar:nth-child(1) aside:nth-child(1) ul.sidebar-menu li:nth-child(3) a:nth-child(1) > span:nth-child(2)")
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
	
	@FindBy (xpath="//input[@placeholder='John Smith']")
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