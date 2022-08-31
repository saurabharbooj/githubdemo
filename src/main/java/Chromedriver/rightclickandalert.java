package Chromedriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclickandalert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement wb = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(wb).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String a= alt.getText();
		
		if(a.contains("paste"))
			{
				System.out.println("test case is pass");
			}
		else
		{
			System.out.println("test case is fail");
		}
			
		Thread.sleep(2000);
		
		alt.accept();
		Thread.sleep(2000);
		driver.close();
	
	}

}
