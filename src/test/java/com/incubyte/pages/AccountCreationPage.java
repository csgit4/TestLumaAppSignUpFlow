package com.incubyte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.incubyte.objrepo.ObjectRepo;

public class AccountCreationPage {

	WebDriver driver;
	
	public AccountCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getAccCreationPageTitle() {
		return driver.getTitle();
	}

	public void enterFirstName(String fname) {
		driver.findElement(ObjectRepo.firstName).sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		driver.findElement(ObjectRepo.lastName).sendKeys(lname);
	}
	
	public void enterEmailAdd(String emailadd) {
		driver.findElement(ObjectRepo.emailAdd).sendKeys(emailadd);
	}
	
	public void enterPassword(String Pwd) {
		driver.findElement(ObjectRepo.pwd).sendKeys(Pwd);
	}
	
	public void enterConfirmPassword(String cpwd) {
		driver.findElement(ObjectRepo.confirmPwd).sendKeys(cpwd);
	}
	
	public void clickOnCreateAccBtn() {
		driver.findElement(ObjectRepo.CreateAccBtn).click();
	}

	public String verifySuccessfulMsg() {
		WebElement msg = driver.findElement(ObjectRepo.successfulMsg);
		return msg.getText();
	}
}
