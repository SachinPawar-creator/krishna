package Practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DynamicXpath 
{

	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	
	{
		
		 driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ubisoft");
		   //ul[@role='listbox']//li/descendant::div[@role='option']
		     
		     Thread.sleep(5000);
		   
		     List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class, 'sbl1')]"));
		     
		     Thread.sleep(5000);
		     
		     System.out.println( list.size());
		          WebElement dr = driver.findElement(By.xpath("dd"));
		          
		          dr.sendKeys(Keys.CONTROL + "c");
		          dr.sendKeys(Keys.CONTROL + "v");
		     
		    
		     
		     Iterator<WebElement> it = list.iterator();
		     
		     while(it.hasNext())
		    	 
		     {
		    	        String string = it.next().getText();
		    	        System.out.println(string);
		    	 
		    	 if(string.equalsIgnoreCase("ubisoft store"))
		    		 
		    	 {
		    		 Thread.sleep(5000);
		    		 it.next().click();
		    		 break;
		    	 }
		    	 
		    	 
		     }
		       
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	@AfterMethod
	public void closing()
	
	{
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
