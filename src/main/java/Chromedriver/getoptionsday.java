package Chromedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsday {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		WebElement wb = driver.findElement(By.id("day"));
		
		Select sel = new Select(wb);
		
		List<WebElement> ls = sel.getOptions();	
		
		for(WebElement abc:ls)
		{
			String a = abc.getText();
			System.out.println(a);
			
			if(a.equals("10"))
			{
				sel.selectByVisibleText("10");
				break;
			}
		
		}
		
		
	}

}
