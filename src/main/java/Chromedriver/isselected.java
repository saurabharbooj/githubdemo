package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/checkbox.html");
		
		boolean a = driver.findElement(By.name("API Testing")).isDisplayed();
		System.out.println(a);
		
		boolean b=driver.findElement(By.name("API Testing")).isEnabled();
		System.out.println(b);
		
		boolean c=driver.findElement(By.name("API Testing")).isSelected();
		System.out.println(c);
	
		driver.findElement(By.name("API Testing")).click();
		
		boolean d =driver.findElement(By.name("API Testing")).isSelected();
		System.out.println(d);
		
		
		
	}
	
	
	

}
