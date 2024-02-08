package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	
FirefoxDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ebay.com");
	}
	
	
	@Test
	public void test1()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement link=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(link);
		action.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a")));
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a")).click();
		
	}
	
	
	// navigation command
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
//	driver.navigate().to("");
	
	//driver.getCurrentUrl();
	
	
	
	
	
	

}
