package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class Contacts extends TestBase 

{
	TestUtil util= new TestUtil();
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactspageverify;

	@FindBy(xpath = "//a[text()='Peter John']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")
	WebElement checkbox;
	
	
	@FindBy(xpath = "//select[@name='title']")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement name;

	@FindBy(xpath = "//input[@id='middle_initial']")
	WebElement middle;

	@FindBy(xpath = "//input[@id='surname']")
	WebElement surname;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement mobilenumber;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//tr[9]//td[2]//input[2]")
	WebElement Remail;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement save;

	public Contacts()

	{
		PageFactory.initElements(driver, this);
	}

	public boolean contactspageverify()

	{
		return contactspageverify.isDisplayed();

	}

	public void Checkbox()

	{
		TestUtil.ImplicitWaitForSpecificElement(driver, checkbox, 20);

	}

	public void contactsclick(String Tname, String Fname,String Lname, String Mnumber )

	{

		Select s = new Select(title);
		s.selectByVisibleText(Tname);
		name.sendKeys( Fname);
		surname.sendKeys(Lname);
		mobilenumber.sendKeys(Mnumber);
		save.click();
		
	}
	
	

}
