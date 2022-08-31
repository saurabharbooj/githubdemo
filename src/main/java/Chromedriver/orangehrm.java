package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("btnAdd")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("firstName")).sendKeys("Saurabh");
		Thread.sleep(2000);
		driver.findElement(By.id("middleName")).sendKeys("Ratnakar");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Arbuj");
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		

	}

}
