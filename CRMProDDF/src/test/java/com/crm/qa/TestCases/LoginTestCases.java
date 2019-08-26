package com.crm.qa.TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Home;
import com.crm.qa.pages.Login;

public class LoginTestCases extends TestBase
{

	Login login;
	Home home;
	public LoginTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void loginpageInitialization()
	{
		Initialization();
		 login= new Login();
	}
	
	@Test
	public void homepageLanding() 
	
	{   
		login.userName(pro.getProperty("username"), pro.getProperty("password")); 
		
		login.homeLanding();
		
	}
	
	
	
	
	
	@AfterMethod
	public void loginpageClosing()
	{
		
		driver.quit();
	}
	
	}
