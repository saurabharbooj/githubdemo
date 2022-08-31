package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbusxpathautomate {

	
		static WebDriver driver;
		
		public static void datePicker(String monthYear, String date)
		{
			while(true)
			{
				String a = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				System.out.println(a);
			
				if(a.equals(monthYear))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//td[@class='next']")).click();
				}
			}
			
			driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
			
		}
		
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("https://www.redbus.in/");

			driver.findElement(By.id("onward_cal")).click();

			redbusxpathautomate.datePicker("Feb 2023", "5");

		
	}

}
