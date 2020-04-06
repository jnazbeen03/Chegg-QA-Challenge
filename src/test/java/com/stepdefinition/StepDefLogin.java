
  package com.stepdefinition;
  
  
  import org.openqa.selenium.support.PageFactory; import org.testng.Assert;
  
  import com.base.Base; import com.pageobjectmodel.LoginPages;
  
  import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
  cucumber.api.java.en.When;
  
  public class StepDefLogin extends Base { 
	  
	  LoginPages lp;
  
  @Given("^I am on Chegg homepage$") public void i_am_on_Chegg_homepage() {
  getDriver();
  
  lp=PageFactory.initElements(driver,LoginPages.class);
  
  }
  
  @When("^I put \"([^\"]*)\", \"([^\"]*)\" and click login$") public void
  i_put_and_click_login(String username, String password) {
	  
  lp.getUsernameField().sendKeys(username);
  lp.getPasswordField().sendKeys(password); 
  lp.getLoginField().submit(); 
  }
  
  @Then("^I successfully login$") public void i_successfully_login() {
	  
  Assert.assertEquals(driver.getTitle(), "Chegg QA Challenge");
  System.out.println(driver.getTitle()); 
  }
  
  
  
  }
 
