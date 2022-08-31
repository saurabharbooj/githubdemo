package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/rightclick1.html");
		
		WebElement wb= driver.findElement(By.id("btn2"));
		
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		String a= driver.findElement(By.xpath("//p[@id='demo2']")).getText();
		
		if(a.contains("Right click"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	}

}
