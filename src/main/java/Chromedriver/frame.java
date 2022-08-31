package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://praf002.github.io/");
		
		//- Enter the full name
				driver.findElement(By.id("name")).sendKeys("Automation Testing");
				
				//- switch to address frame and enter the Pune Text
				driver.switchTo().frame(1);
				driver.findElement(By.id("add")).sendKeys("Pune MH");
				Thread.sleep(5000);
				//- switch to tool name frame and select the jenkins value from drop down
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Frame4.html']")));
				
				WebElement wb =driver.findElement(By.id("course"));
				
				Select sel =new Select(wb);
				sel.selectByValue("9");
				
				Thread.sleep(5000);
				//- switch to selenium link frame and capture the link name
				driver.switchTo().frame(0);
				
				String b =driver.findElement(By.xpath("//a[text()='Selenium']")).getText();
				System.out.println(b);
				
				//It will switch to immediate parent frame
				// switch to tool name frame and capture the selected value from drop down
				Thread.sleep(5000);
				driver.switchTo().parentFrame();
				
				WebElement abc =sel.getFirstSelectedOption();
				String c =abc.getText();
				System.out.println(c);
				
				
				//- switch to mobile no frame and enter the text.
				driver.switchTo().defaultContent();
				Thread.sleep(5000);
				
				driver.switchTo().frame(0);
				WebElement wb3 =driver.findElement(By.id("mob"));
				wb3.sendKeys("432445677");
				System.out.println(wb3.getAttribute("value"));
				
		

	}

}
