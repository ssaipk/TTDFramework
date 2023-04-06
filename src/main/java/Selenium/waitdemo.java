package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitdemo {
	
	public static void main(String[] args) {
		explicit();	
  		
	}
	
	public static void implicit() {
		WebDriver driver=new FirefoxDriver();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  		driver.findElement(By.name("username")).sendKeys("Admin");
  		driver.findElement(By.name("password")).sendKeys("admin123");
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		
  		/*
  		 * open Gmail
  		 * 
  		 * enter email id as trainer@way2automation.com
  		 * enter password as "TestPassword"
  		 */
	}
	
	public static void explicit() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
	}
}
