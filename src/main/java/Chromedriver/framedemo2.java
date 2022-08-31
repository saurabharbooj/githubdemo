package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Windows 10\\\\\\\\Downloads\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AbstractAnnotations")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium.bidi.log")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.navigate().refresh();

	}

}
