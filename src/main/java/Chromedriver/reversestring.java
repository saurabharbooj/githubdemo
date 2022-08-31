package Chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reversestring {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String a = driver.getTitle();
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
		}
		
	}

}
