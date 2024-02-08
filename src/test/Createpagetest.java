package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest extends Baseclass1 {
	
	

	
	@Test
	public void Createtest()
	{
		Createpage page=new Createpage(driver);
		page.createpageclick();
		page.getstartedclick();
		
		
	}

}
