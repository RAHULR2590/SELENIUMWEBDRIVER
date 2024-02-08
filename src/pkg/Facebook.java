package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test1()
	{
		
		
		
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sujas");
		driver.findElement(By.name("login")).click();
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}

}
