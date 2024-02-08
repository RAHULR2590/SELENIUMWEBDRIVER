package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	
	
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
	}
	
	@Test
	public void test1()
	{
		
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-cart-text-container']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gamil.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[8]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}

}
