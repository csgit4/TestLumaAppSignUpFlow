package com.incubyte.objrepo;

import org.openqa.selenium.By;

public class ObjectRepo{

	// HomePage objrepo
	public static final By CreateAccountLink = By.xpath("//div[@class='panel header']//a[text()='Create an Account']");
	public static final By signInBtn = By.xpath("//div[@class='panel header']//following-sibling::a");
	public static final By greetmsg = By.xpath("//div[@class='panel header']//*[text()='Welcome, Somnath Shinde!']");
	
	
	
	//LoginPage objrepo
	
	public static final By emailID = By.xpath("//input[@name='login[username]']");
	public static final By password = By.xpath("//input[@name='login[password]']");
	public static final By signBtn = By.xpath("//div[@class='login-container']//*[text()='Sign In']");

	//AccountCreationPage objrepo
	
	public static final By firstName = By.xpath("//input[@name='firstname']");
	public static final By lastName = By.xpath("//input[@name='lastname']");
	public static final By emailAdd = By.xpath("//input[@name='email']");
	public static final By pwd = By.xpath("//input[@name='password']");
	public static final By confirmPwd = By.xpath("//input[@name='password_confirmation']");
	public static final By CreateAccBtn = By.xpath("//div[@class='column main']//*[text()='Create an Account']");
    public static final By successfulMsg = By.xpath("//div[@class='page messages']//*[text()='Thank you for registering with Main Website Store.']");
 

}
