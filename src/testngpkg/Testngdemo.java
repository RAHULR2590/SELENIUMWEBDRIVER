package testngpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	
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
	
	
	@Test(priority = 2,invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 3,enabled=false)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 1)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("after test");
	}
	

}
