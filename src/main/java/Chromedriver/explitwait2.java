package Chromedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explitwait2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement abc =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		
		abc.click();
		
	}

}
