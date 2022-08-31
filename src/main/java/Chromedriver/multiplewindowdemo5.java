package Chromedriver;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindowdemo5 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("selenium");
		driver.findElement(By.xpath("//a[contains(text(),'HRM')]")).click();
		
		Set<String> b  = driver.getWindowHandles();
		
		ArrayList<String> arr= new ArrayList<String>(b);
		
		driver.switchTo().window(arr.get(1));
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
