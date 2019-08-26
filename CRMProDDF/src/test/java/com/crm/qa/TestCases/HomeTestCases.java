package com.crm.qa.TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Home;
import com.crm.qa.pages.Login;
import com.crm.qa.util.TestUtil;

public class HomeTestCases extends TestBase

{

	Login login;
	Home home;
	TestUtil test;

	public HomeTestCases()

	{
		super();
	}

	@BeforeMethod

	public void homepageInitialization() throws InterruptedException {
		Initialization();
		login = new Login();
		test = new TestUtil();
		login.userName(pro.getProperty("username"), pro.getProperty("password"));
		Thread.sleep(1000);
		login.homeLanding();
		home = new Home();
		

	}

	@Test(enabled = false)
	public void homePageVerification()

	{

		String title = driver.getTitle();
		Assert.assertEquals(title, "CRMPRO");
		System.out.println("Login Page Has Verified");
	}

	@Test(enabled=false)
	public void clickHomebutton()

	{
		test.SwitchToFrame();
		home.homeButton();

	} 
	
	
	@Test
	public void clickonNewcontact()
	
	{
		test.SwitchToFrame();
	home.newcontact();	
		
	}
	
	
	
	
	
	@Test(enabled=false)
	public void contactsButtonTest()
	
	{
		test.SwitchToFrame();
		home.contactsButton();
		
		
	}

	@AfterMethod
	public void closingHomePage()

	{
		driver.quit();

	}

}
