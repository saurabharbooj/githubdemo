package Chromedriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		Dimension d = new Dimension(1500,400);
		driver.manage().window().setSize(d);
		
		int a = d.getHeight();
		System.out.println(a);
		
		int b = d.getWidth();
		System.out.println(b);
		
		
	}

}
