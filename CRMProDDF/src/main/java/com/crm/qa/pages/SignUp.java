package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUp extends TestBase

{
	

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signup;

	@FindBy(name = "first_name")
	WebElement firstname;

	@FindBy(name = "surname")
	WebElement lastname;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "email_confirm")
	WebElement Cemail;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name = "passwordconfirm")
	WebElement passC;

	@FindBy(name = "agreeTerms")
	WebElement terms;

	@FindBy(xpath = "//div[@class='myButton']")
	WebElement signupbutton;

	public SignUp() 
	{
		PageFactory.initElements(driver, this);
	}

	public String Signup() 
	    
	
	{
		    signup.click();
		    return driver.getCurrentUrl();
		     
	}
	public boolean firstname()
	
	{
		firstname.sendKeys("fgfhbhfb");
		     boolean yes = firstname.isDisplayed();
			return yes;
		
	}
	
	public void lastname()
	
	{
		firstname.sendKeys("fgfhbhfb");
	  
	
		lastname.sendKeys("pawar");
		email.sendKeys("sachinpawar9689@gmail.com");
		Cemail.sendKeys("sachinpawar9689@gmail.com");
		username.sendKeys("sachiiin");
		pass.sendKeys("123123123");
		passC.sendKeys("123123123");
		terms.click();
		
	}
	
	public  Login  loginLanding()
	{
		signupbutton.click();
		   //String surl = driver.getCurrentUrl();
		   
		//Question Here
		   return new Login();
	}
	
	public String validateTitle()
	{
		
		return driver.getTitle();
		
	}


	
	
	
	
	
}
