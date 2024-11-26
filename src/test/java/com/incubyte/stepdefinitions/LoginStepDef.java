package com.incubyte.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.incubyte.lumaapphucks.LumaAppHooks;
import com.incubyte.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	public  WebDriver driver;
	private LoginPage lp_obj = new LoginPage(LumaAppHooks.driver);
	
	
	@Then("user redirected to the customer login page and verify title is {string}")
	public void user_redirected_to_the_customer_login_page_and_verify_title_is(String lptitle) {
		  Assert.assertEquals(lp_obj.getLoginPageTitle(), lptitle);
		  LumaAppHooks.scn.log("user redirected to the account creation page and verify title is Create New Customer Account");
	}

	@When("the user enters registered email: {string}")
	public void the_user_enters_registered_email(String emailID) {
		lp_obj.enterEmail(emailID);
		 LumaAppHooks.scn.log("the user enters registered email:");
	}

	@When("valid password: {string}")
	public void valid_password(String password) {
		lp_obj.enterPassword(password);
		 LumaAppHooks.scn.log("user password valid password:");
	}

	@When("clicks the Sign In button")
	public void clicks_the_sign_in_button() {
		lp_obj.signInBtn();
		 LumaAppHooks.scn.log("user clicks the Sign In button");
	}

}
