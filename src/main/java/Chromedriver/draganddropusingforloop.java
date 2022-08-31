package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddropusingforloop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		for(int i=1;i<=7;i++)
		{
			WebElement src = driver.findElement(By.id("box"+i));
			WebElement tgt = driver.findElement(By.id("box10"+i));
			
			act.dragAndDrop(src, tgt).build().perform();
			Thread.sleep(2000);
		}
		
		for(int i=1;i<=7;i++)
		{
			WebElement src = driver.findElement(By.id("box"+i));
			WebElement cap = driver.findElement(By.id("capitals"));
			
			act.dragAndDrop(src, cap).build().perform();
		}
	}

}
