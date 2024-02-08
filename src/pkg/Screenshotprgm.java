package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Software%20testing/new.html");
	}
	
	@Test
	public void screenshot() throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("E://screenshot1.png"));
		
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshots/erroe.png"));
		
	
	}

}
