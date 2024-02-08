package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggrouping {
	
	
	
ChromeDriver driver;
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("http://www.google.com");
	}
	
	
	@Test(groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(groups = {"smoke"})
	public void test5()
	{
		System.out.println("test5");
	}
	
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("after test");
	}
	

}
