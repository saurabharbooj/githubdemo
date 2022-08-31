package Chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priceccomparision {

			public static void main(String[] args) throws InterruptedException {
				
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.flipkart.com");
	        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        
	        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("APPLE iPhone 13 (Starlight, 256 GB)");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        Thread.sleep(3000);
	        
	       String Flipkart= driver.findElement(By.xpath("//div[contains(text(),'₹84,499')]")).getText();
	       System.out.println("price of APPLE iPhone 13 on Flipkart is "+Flipkart);
	        
	       Thread.sleep(3000);
	       
	       driver.navigate().to("https://www.amazon.in/");
	       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("APPLE iPhone 13 (Starlight, 256 GB)");
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       Thread.sleep(3000);
	       
	       String Amazon= driver.findElement(By.xpath("//span[text()='80,990']")).getText();
	       System.out.println("price of APPLE iPhone 13 on Amazon is ₹"+Amazon);
	        
	       Thread.sleep(3000);
	       driver.close();
	       
	       if(Amazon.equals(Flipkart)) 
	       {
	    	   System.out.println("tc is pass");
	    	   
	       }
	       else {
	    	   System.out.println("tc is fail");
	       }

	}

}
