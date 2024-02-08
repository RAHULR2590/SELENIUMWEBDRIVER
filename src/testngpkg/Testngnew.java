package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngnew {
	
	

	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://www.google.com");
	}
	
	
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println("actual title= "+actualtitle);
		String expected="Google.com";
		
		if(actualtitle.equals(expected))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}
	@Test
	public void test2()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}
	@Test
	public void test3()
	{
		
		
			boolean logo=driver.findElement(By.xpath("//*[@id=\"logo\"]")).isDisplayed();
			if(logo)
			{
				System.out.println("logo is present");
			}
			else
			{
				System.out.println("logo is not present");
			} 

	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("after test");
	}
	
	
	
	
	
	

}
