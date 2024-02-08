package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;
import utilities.Excelutl;

public class Fblogintest extends Baseclass1 {
	
	

	
	@Test
	public void fbtest()
	{
		Fbloginpage p1=new Fbloginpage(driver);
	//	ob.setvalues("abc@gmail.com","addf");
	//	ob.login();
		//reading data from excel file by specified path
		
		String xl="C:\\Users\\user\\Desktop\\Software testing\\book1.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutl.getRowCount(xl, Sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutl.getcellvalue(xl, Sheet,i, 0);
			System.out.println("username...."+UserName);
			String Pwd=Excelutl.getcellvalue(xl, Sheet, i, 1);
			System.out.println("password...."+Pwd);
			//passing user name and password as parameters
			p1.setvalues(UserName,Pwd);
			//Submitting the data by clicking on login button
			p1.login();
			
			
			String expectedurl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=101";
			String actualurl=driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}

	}
	
}
