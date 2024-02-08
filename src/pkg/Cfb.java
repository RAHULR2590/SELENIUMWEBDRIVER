package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cfb {
	
	ChromeDriver driver;

	
	@Before
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
				
	}
	
	@Test
	public void tesT()
	{
		driver.findElement(By.name("email")).sendKeys("sonusujas@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sujas");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
