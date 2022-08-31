package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateback {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		String a= driver.getTitle();
		System.out.println(a);
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");
		String b = driver.getTitle();
		System.out.println(b);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		String c= driver.getCurrentUrl();
		System.out.println(c);
				
	}

}
