package com.incubyte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.incubyte.objrepo.ObjectRepo;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateAccountLink() {
		driver.findElement(ObjectRepo.CreateAccountLink).click();;
	}

	public void clickOnSignInLink() {
		driver.findElement(ObjectRepo.signInBtn).click();
	}

	public void greetMsg(String gmsg) {
		WebElement webele = driver.findElement(ObjectRepo.greetmsg);
		gmsg = webele.getText();
	}

}
