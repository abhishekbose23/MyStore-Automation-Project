package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	//Create object of webdriver
	WebDriver lwebdriver;
	
	//create constructor
	public  homePage(WebDriver rwebdriver) {
		
		lwebdriver = rwebdriver;
		
		PageFactory.initElements( rwebdriver, this);
		
	}
	//Identify webelement which you want to interact
	
	@FindBy(linkText = " Signup / Login")
	WebElement SignUp;
	
	// Identify action to be performed on webelement
	
	public void clickOnSignUp() {
		SignUp.click();
	}

}
