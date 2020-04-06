package com.stepdefinition;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;
import com.pageobjectmodel.SettingPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SettingsStep extends Base{
	SettingPages sp;
	@Given("^I am able to go Chegg homepage$")
	public void i_am_able_to_go_Chegg_homepage() throws Throwable {
		getDriver();	
	sp=PageFactory.initElements(driver, SettingPages.class);	
	}

	@When("^I put username and password as \"([^\"]*)\", \"([^\"]*)\" and click login$")
	public void i_put_username_and_password_as_and_click_login(String arg1, String arg2) throws Throwable {
		sp.getUserField().sendKeys(arg1);
		sp.getPassword().sendKeys("testwh2ls8");
		sp.getLogin().submit();
			}
@Then("^I successfully login homepage$")
	public void i_successfully_login_homepage() throws Throwable {

	Assert.assertEquals(driver.getTitle(), "Chegg QA Challenge");
	System.out.println(driver.getTitle());
	 
	}

	@When("^I am able to click Settings button$")
	public void i_am_able_to_click_Settings_button() throws Throwable {
		
		sp.getSettingButton().click();
	  
	}

	@When("^I click on Password$")
	public void i_click_on_Password() throws Throwable {
	 sp.getPasswordField().sendKeys("test");
	}

	@When("^I Verify Password$")
	public void i_Verify_Password() throws Throwable {
	    sp.getVerifyField().sendKeys("test");
	}

	@When("^verify Displayname$")
	public void verify_Displayname() throws Throwable {
	   sp.getUsernameField().sendKeys("test");
	}

	@When("^I check on Save Changes$")
	public void i_check_on_Save_Changes() throws Throwable {
	 sp.getSaveField().click();
	}
}
