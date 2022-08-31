package Chromedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung A 32");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> ls =driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
		
		System.out.println(ls.size());
		for(WebElement abc: ls)
		{
			System.out.println(abc.getText());
		}
		
		
		
		
		
			

	}

}
