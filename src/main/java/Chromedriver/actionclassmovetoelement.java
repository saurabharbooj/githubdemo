package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassmovetoelement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement wb = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		
		driver.findElement(By.linkText("Account")).click();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]")).click();
		
	}

}
