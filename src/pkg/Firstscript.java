package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("Https://www.google.com");
	//	driver.quit();
		
		String actualtitle=driver.getTitle();
		System.out.println("actual title= "+actualtitle);
		String expected="Google.com";
		
		if(actualtitle.equals(expected))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

	}

}
