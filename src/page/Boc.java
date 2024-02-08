package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Boc {
	
	WebDriver driver;
	By buscontrctr=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By contactname=By.xpath("//*[@id=\"txtcontactPerson\"]]");
	By email=By.xpath("//*[@id=\"txtEmail\"]");
	By mobile=By.xpath("//*[@id=\"txtMobileNo\"]");
	
	public Boc(WebDriver driver)
	{
		this.driver=driver;
	}
	public void contract()
	{
		driver.findElement(buscontrctr).click();
		
	}
	
	public void contact(String con)
	{
		driver.findElement(contactname).sendKeys(con);
		
	}
	
	public void mail(String el)
	{
		
	
		driver.findElement(email).sendKeys(el);
		
	}
	public void mobileno(String no)
	{
		
		
		driver.findElement(mobile).sendKeys(no);
		
		
	}
	
	

}
