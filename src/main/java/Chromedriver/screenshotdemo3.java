package Chromedriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotdemo3 {
	
		static WebDriver driver;
		
		public static void screenshot (String path) throws IOException
		{
		
			TakesScreenshot ts = (TakesScreenshot)driver;
		
			File abc = ts.getScreenshotAs(OutputType.FILE);
			
			File dist = new File("C:\\Users\\Windows 10\\Pictures\\Screenshots\\a1.png");
			
			FileUtils.copyFile(abc, dist);
			
		}
	
		public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		
		driver.get("htts://www.google.com/");
		
		screenshotdemo3.screenshot("g2");
		
	}

}
