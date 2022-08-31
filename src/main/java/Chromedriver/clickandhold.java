package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickandhold {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement cap =driver.findElement(By.id("box3"));
		Actions act =new Actions(driver);
		
		act.clickAndHold(cap).build().perform();
		
		Thread.sleep(10000);
		
		WebElement trg =driver.findElement(By.id("box103"));
		
		act.release(trg).build().perform();

	}

}
