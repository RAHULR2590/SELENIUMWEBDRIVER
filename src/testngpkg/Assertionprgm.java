package testngpkg;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgm {
	
	
	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void test() 
	{
		String actualtitle=driver.getTitle();
		String exp="Facebook";
		Assert.assertEquals(exp,actualtitle);
	}
	

}
