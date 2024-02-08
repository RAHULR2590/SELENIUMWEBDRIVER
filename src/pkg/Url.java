package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Url {
	
	String s="http://www.facebook.com";
	ChromeDriver driver;
	
	
	
	@Before
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test() 
	{
		try
		{
		URL n=new URL(s);
		HttpURLConnection con=(HttpURLConnection)n.openConnection();
		con.connect();
		System.out.println("response code is " +con.getResponseCode());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
