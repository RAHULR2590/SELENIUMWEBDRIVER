package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Windowhandler {
	
	
	
	
     WebDriver d;
	
	@BeforeTest
	public void beforetest()
	{
		
		d=new ChromeDriver();
		
	}
	
	
	
	@org.testng.annotations.Test
	public void test() 
	{
		d.get("https://www.naukri.com/");
		
		String parentwindow = d.getWindowHandle();
		
		System.out.println("Parent Window title"+ d.getTitle());
	     d.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[2]/span")).click();
	  
		
		 
		
		 Set<String> allwindowhandles =d.getWindowHandles();
		 
		 for(String handle:allwindowhandles)
		 {
			 if(!handle.equalsIgnoreCase(parentwindow))
				 d.switchTo().window(handle);
			 String s=d.findElement(By.xpath("//*[@id=\"login_Layer\"]")).getText();
			 System.out.println(s);
			 d.close();
		 }
		 d.switchTo().window(parentwindow);
			 
		 }
		 
			 
		 
	}


