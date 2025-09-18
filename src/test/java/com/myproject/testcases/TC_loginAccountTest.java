package com.myproject.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.homePage;
import com.mystore.pageobject.loginAccount;
import com.mystore.pageobject.userSignUp;

public class TC_loginAccountTest extends BaseClass {
	
	@Test
	public void verifyRegistrationLoginPage() {
		
		//open URL
		driver.get(url);
		logger.info("Url Opened");
		
		//Click on SignUp Page from HomePage
		homePage hp = new homePage(driver);
		hp.clickOnSignUp();
		logger.info("click on SignUp");
		
		//On the Signup page, give username, email and click on sign uo for new user
		
		loginAccount la = new loginAccount(driver);
		la.name("Abhishek");     // Enter Name
		logger.info("Enter Name");
		la.email("ab@gmail.com");   // Enter Email
		logger.info("Enter email");
		la.Signup();          //Click on Signup Btn
		logger.info("Click on SignUp Button");
		
		userSignUp usignup = new userSignUp(driver);
		
		usignup.title();
		usignup.userPassword("pass123");
		usignup.userDateOfBirth(23);
		usignup.userMonthOfBirth("September");
		usignup.userYearOfBirth(1997);
		usignup.newsLetterCheckBox();
		usignup.specialOfferCheckBox();
		usignup.firstName("Abhishek");
		usignup.lastName("Bose");
		usignup.userAddress("Chandni Chowk");
		usignup.userCountry("India");
		usignup.userState("New-Delhi");
		usignup.userCity("Delhi");
		usignup.userMobileNumber("8759890000");
		usignup.userZipCode("400650");
		logger.info("Entered user details on signup page");
		
		usignup.btnCreateAccount();
		logger.info("Clicked on CreateAccountBtn");
		
	}

}
