package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement wb= driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]"));
		
		Actions act = new Actions(driver);
		
		act.click(wb).build().perform();
		
		String a=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(a);
		
	}

}
