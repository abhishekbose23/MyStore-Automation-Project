package com.myproject.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.homePage;
import com.mystore.pageobject.loginAccount;

public class TC_loginAccountTest extends BaseClass {
	
	@Test
	public void verifyRegistrationLoginPage() {
		
		//open URL
		driver.get(url);
		logger.info("Url Opened");
		
		//Click on SignUp Page from HomePage
		homePage hp = new homePage(driver);
		hp.clickOnSignUp();
		
		//On the Signup page, give username, email and click on sign uo for new user
		
		loginAccount la = new loginAccount(driver);
		la.name("Abhishek");     // Enter Name
		la.email("ab@gmail.com");   // Enter Email
		la.Signup();          //Click on Signup Btn
		
	}

}
