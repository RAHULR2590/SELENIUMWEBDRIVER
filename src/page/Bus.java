package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Bus  {
	
	
	
	WebDriver driver;
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By date=By.xpath("//*[@id=\"txtFromDate\"]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	public Bus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sourcecity(String Src)
	{
		driver.findElement(source).sendKeys(Src);
		
	}
	
	public void destinationcity(String Des)
	{
		driver.findElement(destination).sendKeys(Des);
		
	}
	
	public void datedetails(String DMY)
	{
		
		driver.findElement(date).clear();
		driver.findElement(date).sendKeys(DMY);
		
	}
	public void searchdetails()
	{
		
		
		driver.findElement(search).click();
		
		
	}
	
	
	


}
