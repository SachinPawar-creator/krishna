package com.crm.qa.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUp;

public class SignupTestCases extends TestBase
{

	
	SignUp signup;
	
	public SignupTestCases ()
	
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	
	{
		Initialization();
		
		 signup= new SignUp();
	}
	@Test(priority=1)
	public void Signupdetails() throws InterruptedException 
	{
		Thread.sleep(1000);

		      String validate = signup.Signup();
		      assertEquals(validate, "https://www.crmpro.com/register/");
		      System.out.println("TestCase has passed");
	}
	@Test(priority=2)
	public void registerName() throws InterruptedException 
	{
Thread.sleep(1000);
		signup.Signup();
		signup.lastname();
		signup.loginLanding();
		
	}
	@AfterMethod
	public void Driverquit()
	{
		driver.quit();
		
	}
	
}
