package Chromedriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmbyxpathdropdown {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("saurabh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("arbuj");
		
		String a = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		System.out.println(a);
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).click();
		
		WebElement wb = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select sel = new Select(wb);
		
		sel.selectByVisibleText("Jan");
		
		WebElement abc = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select sel1 = new Select(abc);
		
		sel1.selectByVisibleText("2025");
		
		driver.findElement(By.xpath("//a[text()='14']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
		
		WebElement ghj = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select sel3 = new Select(ghj);
		
		sel3.selectByVisibleText("Aug");
		
		WebElement jkl = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select sel4 = new Select(jkl);
		sel4.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//a[text()='14']")).click();
		
		WebElement iop = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
		
		Select sel5= new Select(iop);
		
		sel5.selectByIndex(4);
		WebElement rty= sel5.getFirstSelectedOption();
		
		String v = rty.getText();
		System.out.println(v);
		
		List<WebElement> yui = sel5.getOptions();
		
		
		for(WebElement cvb : yui)
		{
			String c = cvb.getText();
			
		
		if(c.contains("Somali"))
		{
			
			System.out.println("tc is pass");
			
		}
		else
		{
			System.out.println("tc is fail");
		}
		
		
		}	
	}

}
