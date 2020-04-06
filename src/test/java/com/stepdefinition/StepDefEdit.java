package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;
import com.pageobjectmodel.EditPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefEdit extends Base {
	EditPages ep;
	@Given("^click on Setting button$")
	public void click_on_Setting_button() throws InterruptedException  {
		getDriver();
		//driver.get("ttps://chegg-qa-challenge.herokuapp.com/testuser-je8ds0dfd");
		ep=PageFactory.initElements(driver, EditPages.class);
        Thread.sleep(300);
		ep.settingButton.click();
		driver.findElement(By.cssSelector("div.has-stickynav.is-primary-indigo.is-alternate-blue-grey div.container.is-fluid.has-mkcontent:nth-child(1) div.columns.is-gapless div.column.is-narrow.is-hidden-touch.sidebar:nth-child(1) aside:nth-child(1) ul.sidebar-menu li:nth-child(3) a:nth-child(1) > span:nth-child(2)")).click();
		
	
	}

	@When("^I click on Password, Verify Password and Username$")
	public void i_click_on_Password_Verify_Password_and_Username() {
		ep.getPasswordField().click();
		ep.getVerifyField().click();
		ep.getUsernameField().click();
		ep.getSaveField().click();
	    
	}

	@Then("^I click on Save Changes$")
	public void i_click_on_Save_Changes()  {

Assert.assertEquals(driver.getTitle(), "Chegg QA Challenge");
   System.out.println(driver.getTitle());
	  
	}



}
