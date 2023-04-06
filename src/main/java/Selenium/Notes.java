package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Notes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
 		DesiredCapabilities cp=new DesiredCapabilities();
 		cp.setCapability(ChromeOptions.CAPABILITY, options);
 		options.merge(cp);
 		WebDriver driver=new ChromeDriver(options);
 		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("SwitchTo")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.linkText("Frames")).click();
 		
 		
 		
 		
 		
 		
 	
	}
}
