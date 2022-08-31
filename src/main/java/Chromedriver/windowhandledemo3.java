package Chromedriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandledemo3 {

	
		static WebDriver driver;
		
		public static void handleDropDown(WebElement wb, String value) {
			Select sel = new Select(wb);
			sel.selectByVisibleText(value);
		}

		public static void takeScreenshot(String filename) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File f =ts.getScreenshotAs(OutputType.FILE);
			//C:\Users\praf0\Desktop\June Batch Script\SeleniumTutorial\newScreenshot
			File dist =new File(System.getProperty("user.dir")+"\\newScreenshot\\"+filename+".png");
			
			FileUtils.copyFile(f, dist);
		}
		

		public static void main(String[] args) throws InterruptedException, IOException {

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://prafpawar11.github.io/multiplewindows.html");

			driver.findElement(By.name("fname")).sendKeys("Selenium");//10

			driver.findElement(By.xpath("//a[contains(text(),'HRM')]")).click();

			driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();

			Thread.sleep(5000);
			
			Set<String> allwindow = driver.getWindowHandles();
			//we have to created object of ArrayList  by passing Set interface referene name or Object Name
			ArrayList<String> allWin = new ArrayList<String>(allwindow);
			
			

			driver.switchTo().window(allWin.get(1));
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			WebElement day = driver.findElement(By.id("day"));
			windowhandledemo3.handleDropDown(day, "25");
			Thread.sleep(3000);
			WebElement month = driver.findElement(By.id("month"));

			windowhandledemo3.handleDropDown(month, "Jun");
			Thread.sleep(3000);
			WebElement year = driver.findElement(By.id("year"));

			windowhandledemo3.handleDropDown(year, "2000");
			Thread.sleep(3000);
			windowhandledemo3.takeScreenshot("fb1");
			
			driver.switchTo().window(allWin.get(2));
			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(5000);
			windowhandledemo3.takeScreenshot("hrm");
			
			driver.switchTo().window(allWin.get(0));
			Thread.sleep(5000);
			driver.findElement(By.name("lname")).sendKeys("testng");
			
			windowhandledemo3.takeScreenshot("main");
			
			driver.switchTo().window(allWin.get(1));
			
			driver.findElement(By.name("reg_email__")).sendKeys("123456789");
			
			
		
			
			
		}

	

	}


