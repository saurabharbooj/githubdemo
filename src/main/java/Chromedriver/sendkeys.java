package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		boolean a= driver.findElement(By.id("txtUsername")).isDisplayed();
		System.out.println(a);
		
		boolean b=driver.findElement(By.id("txtUsername")).isEnabled();
		System.out.println(b);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
		boolean c=driver.findElement(By.id("txtPassword")).isDisplayed();
		System.out.println(c);
		
		boolean d=driver.findElement(By.id("txtPassword")).isEnabled();
		System.out.println(d);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		boolean e= driver.findElement(By.id("btnLogin")).isDisplayed();
		System.out.println(e);
		
		boolean f=driver.findElement(By.id("btnLogin")).isEnabled();
		System.out.println(f);
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		String g=driver.getTitle();
		if(g.contains("HRM"))
		{
			System.out.println("test case is pass for title ");
		}
		else
		{
			System.out.println("test case is fail for title");
		}	

	}

}
