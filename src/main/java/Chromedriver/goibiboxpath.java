package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		while(true)
		{
		
		String  a =driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']")).getText();
		
		System.out.println(a);
		
		if(a.equals("March 2023"))
		{
			break;
		}
		else {
			driver.findElement(By.xpath("//span[contains(@class,'NavButton--n')]")).click();
		}
}
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]//p[text()='10']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
}

	
}