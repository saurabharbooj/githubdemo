package Chromedriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotdemo5 {

	public static void main(String[] args) throws IOException {
	
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File abc =ts.getScreenshotAs(OutputType.FILE);
		
		File dist =new File("C:\\Users\\Windows 10\\eclipse-workspace\\Maven1\\screenshots\\"+System.currentTimeMillis()+".png");
						
		FileUtils.copyFile(abc, dist);

	}

}
