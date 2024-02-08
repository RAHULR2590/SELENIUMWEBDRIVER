package testngpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterization {
	
	
	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	
	@Parameters({"username","password"})
	@Test
	public void test1(String un,String pswd)
	{
		
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
