package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class codereuse {
	
	 static WebDriver driver;
	 
	 public static void selectdpvalue(WebElement wb, String value)
	 {
		 Select sel = new Select(wb);
		 sel.selectByVisibleText(value);
	 }

	 public static void main(String[] args) 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/reg");
		 
		 WebElement day = driver.findElement(By.id("day"));
		 codereuse.selectdpvalue(day, "10");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 codereuse.selectdpvalue(month, "Aug");
		 
		 WebElement year = driver.findElement(By.id("year"));
		 codereuse.selectdpvalue(year, "2010");
		  
	 } 

}
