package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ilogicinfo {
	
	
	
	
	
ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.nssunionmatrimony.com/default.aspx");
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"bs-megadropdown-tabs\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-megadropdown-tabs\"]/ul/li[2]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"bs-megadropdown-tabs\"]/ul/li[3]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"bs-megadropdown-tabs\"]/ul/li[4]/a")).click();
		driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id=\"bs-megadropdown-tabs\"]/ul/li[5]/a")).click();
	    Thread.sleep(3000);
	    WebElement button=driver.findElement(By.xpath("//*[@id=\"KittyModal\"]/div/div/div[1]/button/span"));
	    button.click();
	    
	    
				
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String src=driver.getPageSource();
		if(src.contains("NSS Matrimony"))
		{
			System.out.println("test is present");
		}
		else
		{
			System.out.println("test is not present");
		}
        WebElement profile=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlProfileFor\"]"));
        Select profiledetails=new Select(profile);
        profiledetails.selectByVisibleText("Brother");
        List<WebElement>li=profiledetails.getOptions();
		System.out.println("count of profile"+li.size());
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtName\"]")).sendKeys("GOKUL R");
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlGender\"]"));
	    Select genderdetails=new Select(gender);
	    genderdetails.selectByVisibleText("Male");
	    List<WebElement>l=genderdetails.getOptions();
	    System.out.println("count of profile"+l.size());
	}

}
