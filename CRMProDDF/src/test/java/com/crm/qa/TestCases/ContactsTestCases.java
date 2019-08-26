package com.crm.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contacts;
import com.crm.qa.pages.Home;
import com.crm.qa.pages.Login;
import com.crm.qa.util.TestUtil;

public class ContactsTestCases extends TestBase 
{

	Login login;
	 TestUtil test;
	Home home;
	Contacts contacts;
	public ContactsTestCases()
	
	{
		super();
	}
	
	@BeforeMethod
	public void  Contactspageintialization() throws InterruptedException
	
	{
		
		Initialization();
		login = new Login();
		test = new TestUtil();
		login.userName(pro.getProperty("username"), pro.getProperty("password"));
		Thread.sleep(1000);
		login.homeLanding();
		home = new Home();
		test.SwitchToFrame();
	    contacts = home.contactsButton();
	   
		
	}
	
	@Test(enabled=false)
	public void contactspage()
	
	{
		Assert.assertTrue(contacts.contactspageverify(), "Done");
		
	}
	
	@Test(priority=1)
	public void click()
	{
		contacts.Checkbox();
	}
	
	@DataProvider
	public Object[][] Data()
	{
		       Object[][] sheet = test.DataProvider(0);
		       return sheet;
	}
	
	@Test(priority=2, dataProvider="Data")
	public void TestDataExcel(String Tname, String Fname, String Lname, String Mnumber)
	
	{
		System.out.println("done");
		home.newcontact();
		
		contacts.contactsclick( Tname, Fname, Lname, Mnumber);
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void CLosing()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
