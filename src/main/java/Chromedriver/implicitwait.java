package Chromedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class implicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
		
		driver.close();
	}

}
