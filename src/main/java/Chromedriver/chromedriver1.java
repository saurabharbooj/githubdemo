package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		String a =driver.getTitle();
		
		if(a.contains("HRM"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		String b = driver.getCurrentUrl();
		
		if(b.contains("inde"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test cse is fail");
		}
		

	}

}
