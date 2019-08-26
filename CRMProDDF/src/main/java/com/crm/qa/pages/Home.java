package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Home extends TestBase {

	@FindBy(xpath = "//ul[@class='mlddm']//a[contains(text(),'Home')]")
	WebElement homeButton;

	@FindBy(xpath = "//a[@title='Calendar']")
	WebElement calendarButton;

	@FindBy(xpath = "//a[@title='Companies']")
	WebElement companieButton;

	@FindBy(xpath = "//a[@title='Contacts']")
	WebElement contactsButton;

	@FindBy(xpath = "//a[@title='Deals']")
	WebElement dealsButton;

	@FindBy(xpath = "//a[@title='Tasks']")
	WebElement TasksButton;

	@FindBy(xpath = "//a[@title='Cases']")
	WebElement CasesButton;

	@FindBy(xpath = "//a[@title='Call']")
	WebElement CallButton;

	@FindBy(xpath = "//a[@title='Email']")
	WebElement EmailButton;

	@FindBy(xpath = "//a[@title='Text/SMS']")
	WebElement TextButton;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact' )]")
	WebElement newcontact;
	

	public Home()

	{
		PageFactory.initElements(driver, this);
	}

	public void homeButton() {
		homeButton.click();

	}

	public void calendarButton()

	{
		calendarButton.click();
		

	}

	public void companieButton()

	{
		companieButton.click();

	}

	public Contacts  contactsButton()

	{
		contactsButton.click();
		return new Contacts();

	}
	
	public void newcontact()
	{
		Actions a= new Actions(driver);
		a.moveToElement(contactsButton).moveToElement(newcontact).click().build().perform();
		
	}

	public void dealsButton()

	{
		dealsButton.click();

	}

	public void TasksButton()

	{
		TasksButton.click();

	}

	public void CasesButton()

	{
		CasesButton.click();

	}

	public void CallButton()

	{
		CallButton.click();

	}

	public void EmailButton()

	{
		EmailButton.click();

	}

	public void TextButton()

	{
		TextButton.click();

	}

}
