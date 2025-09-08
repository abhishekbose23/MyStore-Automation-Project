package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginAccount {
	
	WebDriver ldriver;
	
	//Create Constructor
	public loginAccount(WebDriver rdriver) {
		
		ldriver = rdriver;
	PageFactory.initElements( rdriver, this);
		
	}
	
	@FindBy(name = "name")
	WebElement enterName;
	
	@FindBy(name = "email")
	WebElement enterEmail;
	
	@FindBy(name = "Signup")
	WebElement btnSignup;
	
	public void name (String Name) {
		enterName.sendKeys(Name);
	}
	
	public void email(String EmailAdd) {
		enterEmail.sendKeys(EmailAdd);
	}
	
	public void Signup() {
		btnSignup.click();
	}

}
