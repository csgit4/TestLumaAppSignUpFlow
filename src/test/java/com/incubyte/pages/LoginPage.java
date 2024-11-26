package com.incubyte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.incubyte.objrepo.ObjectRepo;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enterEmail(String emaild) {
		driver.findElement(ObjectRepo.emailID).sendKeys(emaild);
	}

	public void enterPassword(String pword) {
		driver.findElement(ObjectRepo.password).sendKeys(pword);
	}

	public void signInBtn() {
		driver.findElement(ObjectRepo.signBtn).click();
	}

}
