package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	
	
ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test1()
	{
	WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
	WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest);
	act.perform();
	String exp="Dropped!";
	String actualtest=dest.getText();
	if(actualtest.equals(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	
	
	
	
	
	

}
