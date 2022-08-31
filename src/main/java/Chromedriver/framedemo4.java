package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framedemo4 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://praf002.github.io/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("saurabh");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("mob")).sendKeys("8237430373");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("add")).sendKeys("nashik");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		String a= driver.findElement(By.id("mob")).getAttribute("value");
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		String b= driver.findElement(By.id("add")).getAttribute("value");
		System.out.println(b);
		
		
	}

}
