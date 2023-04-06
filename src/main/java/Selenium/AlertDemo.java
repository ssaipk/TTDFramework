package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(2000);
		//at this point there is an alert present
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		String alerttext = ale.getText();
		System.out.println(alerttext);
		ale.sendKeys("Praveen");
		ale.accept();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
