package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Boc;

public class Bocdetails {
	
	
	
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		
	}
	
	@Test
	public void bustckt() 
	{
		
		Boc details =new Boc(driver);
		details.contract();
		details.contact("RAHUL");
		details.mail("abc@gmail.com");
		details.mobileno("9854126340");
				
	}
	

}
