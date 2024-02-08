package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotnew {

	
		ChromeDriver driver;
		
		@BeforeTest
		public void setUp()
		{
			driver = new ChromeDriver();
		}
		
		@BeforeMethod
		public void url() 
		{
			driver.get("C:\\Users\\user\\Desktop\\Software testing\\new fb.html ");
		}
	
		@Test
		public void test() throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("E://screenshot2.png"));
			
			WebElement button=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div"));
			File src1=button.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1,new File("./Screenshots/FB.png"));

	}

}
