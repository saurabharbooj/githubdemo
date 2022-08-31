package Chromedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listwebelement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Windows 10\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//print all link name in console
		driver.get("https://www.amazon.com/");
		
		List<WebElement> ls =driver.findElements(By.tagName("a"));
		
		System.out.println(ls.size());
		for(WebElement abc: ls)
		{
			System.out.println(abc.getText());
		}

	}

}
