package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Windowhandlerror {
WebDriver d;
	
	@BeforeTest
	public void beforetest()
	{
		
		d=new ChromeDriver();
		
	}
	
	
	
	@org.testng.annotations.Test
	public void test() 
	{
		d.get("http://demo.guru99.com/popup.php");
		
		String parentwindow = d.getWindowHandle();
		
		System.out.println("Parent Window title"+ d.getTitle());
	     d.findElements(By.xpath("/html/body/p/a"));
	  
		
		 
		
		 Set<String> allwindowhandles =d.getWindowHandles();
		 
		 for(String handle:allwindowhandles)
		 {
			 if(!handle.equalsIgnoreCase(parentwindow))
				 d.switchTo().window(handle);
			 String s=d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[1]")).getText();
			 System.out.println(s);
			 d.close();
		 }
		 d.switchTo().window(parentwindow);
			 
		 }
		 
			 
		 
	}




}
