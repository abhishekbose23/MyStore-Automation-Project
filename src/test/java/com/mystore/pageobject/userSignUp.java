package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class userSignUp {
	
	//create object of Webdriver
	WebDriver lwebdriver;
	
	//create constructor
	public userSignUp(WebDriver rwebdriver) {
		
		rwebdriver = lwebdriver;
		
		PageFactory.initElements(rwebdriver, this);
		
	}
	
	//Identify webelement which you want to interact
	
	@FindBy(xpath = "//input[@id='id_gender1']")  // Title Mr
	WebElement selectTitleMr;
	
  @FindBy(xpath ="//input[@id='password']")
  WebElement enterUserPassword;
  
  @FindBy(xpath = "//select[@id='days']")
  WebElement selectDateOfBirthday ;
  
  @FindBy(xpath = "//select[@id='months']")
  WebElement selectMonthOfBirthday ;
  
  @FindBy(xpath = "//select[@id='years']")
  WebElement selectYearOfBirth ;
  
  @FindBy(xpath = "//input[@id='newsletter']")
  WebElement selectNewsLetterCheckBox ;
  
  @FindBy(xpath = "//input[@id='optin']")
  WebElement selectSpecialOffersCheckBox ;
  
  @FindBy(xpath = "//input[@id='first_name']")
  WebElement enterFirstName ;
  
  @FindBy(xpath = "//input[@id='last_name']")
  WebElement enterLastName ;
  
  @FindBy(xpath = "//input[@id='address1']")
  WebElement enterAddress ;
  
  @FindBy(xpath = "//select[@id='country']")
  WebElement selectCountry ;
  
  @FindBy(xpath = "//input[@id='state']")
  WebElement enterState ;
  
  @FindBy(xpath = "//input[@id='city']")
  WebElement enterCity ;

  @FindBy(xpath = "//input[@id='zipcode']")
  WebElement enterZipCode ;

  @FindBy(xpath = "//input[@id='mobile_number']")
  WebElement enterMobileNumber ;

@FindBy(xpath = "//button[@data-qa='create-account']")
WebElement clickOnCreateAccount ;



//Identify action to be performed on webelement

public void title () {
	selectTitleMr.click();
}

public void userPassword(String pass) {
	enterUserPassword.sendKeys(pass);
}
public void userDateOfBirth(int index) {
	
	Select obj1= new Select (selectDateOfBirthday);
	obj1.selectByIndex(index);
}
public void userMonthOfBirth (String month) {
	
	Select obj2 = new Select(selectMonthOfBirthday);
	obj2.selectByVisibleText(month);
}

public void userYearOfBirth (int year) {
	
	Select obj3 = new Select(selectYearOfBirth);
obj3.selectByIndex(year);	
}
public void newsLetterCheckBox () {
	selectNewsLetterCheckBox.click();
}
public void specialOfferCheckBox () {
	selectSpecialOffersCheckBox.click();
}
public void firstName (String fName) {
	enterFirstName.sendKeys(fName);
}
public void lastName(String lName) {
	enterLastName.sendKeys(lName);
}
public void userAddress (String add) {
	enterAddress.sendKeys(add);
}
public void userCountry (String country) {
	Select obj4 = new Select(selectCountry);
	obj4.selectByContainsVisibleText(country);
}
public void userState (String state) {
	enterState.sendKeys(state);
}
public void userCity(String city) {
	enterCity.sendKeys(city);
}
public void userZipCode (String zip) {
	enterZipCode.sendKeys(zip);
}
public void userMobileNumber (String num) {
	enterMobileNumber.sendKeys(num);
}

public void btnCreateAccount () {
	clickOnCreateAccount.click();
}

	

}
