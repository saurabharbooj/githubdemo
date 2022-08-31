package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumusingjava {
	
	static WebDriver driver;
	
	public static void abc(String a,String b)
	{
		if(a.contains(b))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is pass");
		}
	
	}
	
		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		String a= driver.getTitle();
		seleniumusingjava.abc(a, "LinkedIIn");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.salesforce.com/in/?ir=1");
		String b =driver.getTitle();
		seleniumusingjava.abc(b, "salesforce");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		String c =driver.getCurrentUrl();
		seleniumusingjava.abc(c, "salesforce");
		
	
		driver.navigate().forward();
		String d =driver.getCurrentUrl();
		seleniumusingjava.abc(d, "salesforce");

	}

}
