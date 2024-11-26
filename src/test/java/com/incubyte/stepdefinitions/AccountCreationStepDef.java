package com.incubyte.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.incubyte.lumaapphucks.LumaAppHooks;
import com.incubyte.pages.AccountCreationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreationStepDef {
	
	WebDriver driver;
	AccountCreationPage accCreatePage = new AccountCreationPage(LumaAppHooks.driver);

	@Then("user redirected to the account creation page and verify title is {string}")
	public void user_redirected_to_the_account_creation_page_and_verify_title_is(String expTitle) {
		Assert.assertEquals(accCreatePage.getAccCreationPageTitle(), expTitle);
	}
	
	@When("user enter valid firstname: {string}")
	public void user_enter_valid_firstname(String fname) {
		accCreatePage.enterFirstName(fname);
	}

	@When("enter valid lastname: {string}")
	public void enter_valid_lastname(String lname) {
		accCreatePage.enterLastName(lname);
	}

	@When("enter valid email: {string}")
	public void enter_valid_email(String emailAdd) {
		accCreatePage.enterEmailAdd(emailAdd);
	}

	@When("enter valid password: {string}")
	public void enter_valid_password(String pwd) {
		accCreatePage.enterPassword(pwd);
	}

	@When("enter valid confirm password: {string}")
	public void enter_valid_confirm_password(String cpwd) {
		accCreatePage.enterConfirmPassword(cpwd);
	}

	@When("click on Create an Account button")
	public void click_on_create_an_account_button() {
		accCreatePage.clickOnCreateAccBtn();
	}

	@Then("user account should be created and verify message {string}")
	public void user_account_should_be_created_and_verify_message(String expMsg) {
		Assert.assertEquals(accCreatePage.verifySuccessfulMsg(),expMsg);
	}


}
