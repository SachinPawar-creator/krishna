package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class Login extends TestBase 
{

	TestUtil util= new TestUtil();
	@FindBy(name="username")
	WebElement username;
	

	@FindBy(name="password")
	WebElement password;
	

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	public Login()
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void userName(String un, String pass)
	{
		
		username.sendKeys(un);
		password.sendKeys(pass);
		
	}
	
	
	
	public Home homeLanding()
	
	{
	
		TestUtil.ImplicitWaitForSpecificElement(driver, loginButton, 20);
		return new Home();
		
	}
	
	
	
	
	
	
	
	
	
	
}
