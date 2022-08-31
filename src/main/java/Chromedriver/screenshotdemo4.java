package Chromedriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotdemo4 {

		static WebDriver driver;
		
		public static void screenshotdemo (String path) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File abc = ts.getScreenshotAs(OutputType.FILE);
			
			File dist = new File ("C:\\Users\\Windows 10\\eclipse-workspace\\Maven1\\screenshots"+ path +".png" );
			
			FileUtils.copyFile(abc, dist);
				
		}
		
		public static void main(String[] args) throws IOException {
			
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
			
			driver.get("https://classic.freecrm.com/index.html?e=1");
			screenshotdemo4.screenshotdemo("a2");
			
			driver.findElement(By.name("username")).sendKeys("demo123");
			driver.findElement(By.name("password")).sendKeys("demo123");
			
			screenshotdemo4.screenshotdemo("a3");
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			screenshotdemo4.screenshotdemo("a4");
			

	}

}
