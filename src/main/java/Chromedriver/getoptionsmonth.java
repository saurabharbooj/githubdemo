package Chromedriver;



import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getoptionsmonth {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.linkText("PIM")).click();
		
		WebElement wb =driver.findElement(By.id("resultTable"));
		
		
		List<WebElement> ls =driver.findElements(By.xpath("//table[@id='resultTable']"));
				
		
		System.out.println(ls.size());
		
		for(WebElement abc:ls)
		{
			System.out.println(abc.getText());
		}
		
		
		
		
	}

}
