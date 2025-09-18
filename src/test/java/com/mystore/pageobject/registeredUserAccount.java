package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredUserAccount {

	WebDriver lwebdriver;

	public registeredUserAccount( WebDriver rwebdriver) {

		lwebdriver = rwebdriver;
		PageFactory.initElements( rwebdriver, this);

	}
	// identifying webelement which you want to interact

	@FindBy(xpath = "//b[.='Account Created!']")
	WebElement registeredUser;
	
	public String accountCreationText() {
	String text	= registeredUser.getText();
	
	return text;
		
	}
}
