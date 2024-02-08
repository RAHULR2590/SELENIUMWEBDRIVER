package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Software%20testing/new.html");
	}
	
	@Test
	public void test1()
	{
		
		
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		if(text.equalsIgnoreCase("hello i am an alert box!"))
		{
		System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Rahul");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Radhakrishnan");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
