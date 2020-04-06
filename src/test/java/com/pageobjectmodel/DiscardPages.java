package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscardPages {
	WebDriver driver;

	public DiscardPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='toc-anchor nc-icon-outline location_bookmark-add internal-link']")
	public WebElement homepageField;

	public WebElement getHomepageField() {
		return homepageField;
		
	}
	
	@FindBy (linkText="Discard")
	public WebElement discardField;

	public WebElement getDiscardField() {
		return discardField;
	
	}
}