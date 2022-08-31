package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowngd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		WebElement abc = driver.findElement(By.id("month"));
		
		Select xyz = new Select(abc);
		
		xyz.selectByVisibleText("Nov");
		
		WebElement wb = xyz.getFirstSelectedOption();
		
		String jkl = wb.getText();
		System.out.println(jkl);
		
		
		
		
		
		
		
		
		
	}

}
