package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framedemo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		Thread.sleep(3000);
		
	
	}

}
