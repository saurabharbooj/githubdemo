package Chromedriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindow2 {

	
//	open a appplication
//	enter first name
//	click on fb link
//	enter the first name and mob no.
//	then switch to parent window and enter the last name
//	quit the browser
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		String a = driver.getWindowHandle();
		System.out.println(a);
		
		driver.findElement(By.xpath("//body//input[1]")).sendKeys("selenium");
		driver.findElement(By.xpath("//a[2]")).click();
		
		Set<String>b = driver.getWindowHandles();
		System.out.println(b.size());
		
		for(String s:b)
		{
			if(!(s.equals(a)))
			{
				driver.switchTo().window(s);
				
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saurabh");
		
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567894");
		
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				File abc = ts.getScreenshotAs(OutputType.FILE);
				
				File dist = new File("C:\\Users\\Windows 10\\Pictures\\Screenshots\\abc.png");
				
				FileUtils.copyFile(abc, dist);
		
			}
		
			}
			driver.switchTo().window(a);
			driver.findElement(By.xpath("//body//input[2]")).sendKeys("abcgdf");
			driver.quit();
	}
		
}
