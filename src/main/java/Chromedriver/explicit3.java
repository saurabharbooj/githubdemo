package Chromedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicit3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(10));
		WebElement abc =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Selenium']")));
		
		System.out.println(abc.getText());
		

	}

}
