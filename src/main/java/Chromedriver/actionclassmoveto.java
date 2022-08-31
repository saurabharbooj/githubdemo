package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassmoveto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Orders")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("saurabh arbuj");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8237430373");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcdefgh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}

}
