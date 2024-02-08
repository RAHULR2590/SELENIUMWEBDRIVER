package pkg;

import java.net.HttpURLConnection;
import java.net.URL;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulurl {
	
	
	
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setup()
	{
    driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		try
		{
    HttpURLConnection c=
    (HttpURLConnection)new
    URL("https://www.facebook.com")
    .openConnection();
    
    // connection started and get response code
    c.connect();
	
   
	
	
	
    System.out.println("Http response code: " + c.getResponseCode());
	}
    catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
 }
}




