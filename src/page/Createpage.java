package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	
	
	
	WebDriver driver;
	 
	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbgetstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createpageclick()
	{
		driver.findElement(fbcreatepage).click();
		
	}
	
	public void getstartedclick()
	{
		driver.findElement(fbgetstarted).click();
	}

}
