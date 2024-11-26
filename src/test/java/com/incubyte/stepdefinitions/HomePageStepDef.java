package com.incubyte.stepdefinitions;


import com.incubyte.lumaapphucks.LumaAppHooks;
import com.incubyte.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	private HomePage hPage;
 
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		LumaAppHooks.driver.get(LumaAppHooks.prop.getProperty("url"));
		hPage = new HomePage(LumaAppHooks.driver);
		LumaAppHooks.scn.log("Application url launched successfully :");
	}
	
	@When("user click on Create an Account link")
	public void user_click_on_create_an_account_link() {
		hPage.clickOnCreateAccountLink();
		LumaAppHooks.scn.log("user click on Create an Account link :");
	}

	@When("user click on Sign In link")
	public void user_click_on_sign_in_link() {
		hPage.clickOnSignInLink();
		LumaAppHooks.scn.log("user click on Sign In link :");
	}

	@Then("user should successfully Sign-in into the system and see greet message as {string}")
	public void user_should_successfully_sign_in_into_the_system_and_see_greet_message_as(String greetmsg) {
		hPage.greetMsg(greetmsg);
		LumaAppHooks.scn.log("user should successfully Sign-in into the system and see greet message as \"Welcome, Somnath Shinde!\" :");
	}
}
