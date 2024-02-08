package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Bus;

public class Businfo {
	
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		
	}
	
	@Test
	public void bustest() 
	{
		
		Bus info=new Bus(driver);
		info.sourcecity("BANGLORE");
		info.destinationcity("MUMBAI");
		info.datedetails("21-06-2023");
		info.searchdetails();
				
	}
	
	
	
	

}
