package testngpkg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffassertion {
	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void test() 
	{
		
		String box=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
		String exp="Create my account >>";
		Assert.assertEquals(exp,box);
		System.out.println(box);
		
		
		
				
				
		
	}

}
