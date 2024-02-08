
package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahullinkcount {
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test1() throws Exception
	{
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links= "+links.size());
		 

}

}

