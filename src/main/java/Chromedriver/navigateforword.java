package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateforword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		String a= driver.getTitle();
		
		if(a.contains("Linkedin"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		System.out.println(a);
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.salesforce.com/in/?ir=1");
		String b= driver.getTitle();
		
		if(b.contains("CRM"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		System.out.println(b);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		String c= driver.getCurrentUrl();
		if(b.contains("salesforce"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		System.out.println(c);
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		String d= driver.getCurrentUrl();
		if(b.contains("salesforce"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		System.out.println(d);
		

		
	}

}
