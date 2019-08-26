package com.crm.qa.base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebdriverEvent;

public class TestBase  {

	public static WebDriver driver;
	public static Properties pro;
	public static EventFiringWebDriver edriver;
	 public static WebdriverEvent elistener;
	
	 
	public TestBase()

	{
		try {
			pro = new Properties();
			FileInputStream file = new FileInputStream("/CRMProDDF/src/main/java/com/crm/qa/config/Config.properties");
			pro.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exceptionhas HANDLED");
		}

	}
	
	
	public static void Initialization()
	
	{
		
		     String browsername = pro.getProperty("browser");
		     
		     if (browsername.equalsIgnoreCase("chrome"))
		    	 
		     {
		    	 System.setProperty("Webdriver.chrome.driver", pro.getProperty("chromepath"));
		    	 driver= new ChromeDriver();
		    	 
		     }
		     else if (browsername.equalsIgnoreCase("firefox"))
		     {
		    	 //System.setProperty("", value)
		    	 
		    	 driver= new FirefoxDriver();
		    	 
		     }
		     else if (browsername.equalsIgnoreCase("IE"))
		    	 
		     {
		    	 System.setProperty("webdriver.InternetExplorer.driver", pro.getProperty("IEpath"));
		    	 driver= new InternetExplorerDriver();
		     }
		     
		      edriver= new EventFiringWebDriver(driver);
		      elistener= new WebdriverEvent();
		      edriver.register(elistener);
		      driver=edriver;
		      
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Loadout_Wait, TimeUnit.SECONDS);
		     
		     driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);

		
		     driver.get(pro.getProperty("url"));
		
		
		
		
		
		
		
		
		
	}
	

}
