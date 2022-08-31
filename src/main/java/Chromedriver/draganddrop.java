package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = driver.findElement(By.id("box3"));
		WebElement tgt = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, tgt).build().perform();
		
		String a = src.getCssValue("background-color");
		
		if(a.equals("rgba(0, 255, 0, 1)"))
		{
			System.out.println("test case is pass");
		}
		else 
		{
			System.out.println("test case is fail");
		}
		
		Thread.sleep(2000);
		
		WebElement cap = driver.findElement(By.id("capitals"));
		
		act.dragAndDrop(src, cap).build().perform();
		

	}

}
