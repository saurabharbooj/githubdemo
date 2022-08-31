package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String a =driver.getTitle();
		
		System.out.println(a);
		
		//forcefully we are stopping execution for 5 sec
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com/");
		
		String b =driver.getCurrentUrl();
		
		System.out.println(b);
		
		
			
	}

}

