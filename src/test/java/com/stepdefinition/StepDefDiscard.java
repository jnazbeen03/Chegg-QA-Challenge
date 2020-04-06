package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;
import com.pageobjectmodel.DiscardPages;
import com.pageobjectmodel.LoginPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefDiscard extends Base {
	DiscardPages dp;
	LoginPages Lp;

	@Given("^I am on Chegg Homepage$")
	public void i_am_on_Chegg_Homepage() {
		getDriver();
		dp = PageFactory.initElements(driver, DiscardPages.class);
		Lp = PageFactory.initElements(driver, LoginPages.class);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) {
		Lp.getUsernameField().sendKeys("testuser+wh2ls8@example.com");
		Lp.getPasswordField().sendKeys("testwh2ls8");
		Lp.getLoginField().submit();
		dp.homepageField.click();
	}

	@When("^I click on \"([^\"]*)\"  option$")
	public void i_click_on_option(String arg1) {
		dp.discardField.click();
		driver.switchTo().alert().dismiss();
	}

	@Then("^I successfully discarded the content\\.$")
	public void i_successfully_discarded_the_content() {
		Assert.assertEquals(driver.getTitle(), "Chegg QA Challenge");
		System.out.println(driver.getTitle());
	}
}
