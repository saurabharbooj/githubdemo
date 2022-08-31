package Chromedriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	
		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/radiobutton.html");
		
		WebElement wb =driver.findElement(By.id("pune"));
		
		//operation on pune button
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());
		System.out.println(wb.isSelected());
		Thread.sleep(5000);
		wb.click();
		Thread.sleep(5000);
		System.out.println(wb.isSelected());
		Thread.sleep(5000);
		wb.click();
		System.out.println(wb.isSelected());
		
		
		System.out.println("========================================");
		
		//operation on mumbai button
		WebElement wb1 =driver.findElement(By.id("mumbai"));
		System.out.println(wb1.isDisplayed());
		System.out.println(wb1.isEnabled());
		System.out.println(wb1.isSelected());
		Thread.sleep(5000);
		wb1.click();
		Thread.sleep(5000);
		System.out.println(wb1.isSelected());
		Thread.sleep(5000);
		System.out.println(wb.isSelected());
		
			
	}

}
