package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	
	
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fbloginbutton=By.name("login");
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void setvalues(String Username,String pwd)
	{
		driver.findElement(fbemail).sendKeys(Username);
		driver.findElement(fbpassword).sendKeys(pwd);
	}
	
	public void login()
	{
		driver.findElement(fbloginbutton).click();
	}
	

}
