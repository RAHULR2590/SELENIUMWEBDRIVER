package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploading {
	
	
	
ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test() 
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\user\\Desktop\\Software testing\\book1.xlsx");
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		
	}
	
	
	
	
	
	

}
