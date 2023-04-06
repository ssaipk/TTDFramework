package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Assignment {
	
	//https://demo.automationtesting.in/Frames.html
	/*
	 * 1.Alerts
	 * 2.WindowHandles
	 * 3.Frames
	 */
     public static void main(String[] args) throws InterruptedException {
    	 ChromeOptions options=new ChromeOptions();
  		options.addArguments("--remote-allow-origins=*");
  		DesiredCapabilities cp=new DesiredCapabilities();
  		cp.setCapability(ChromeOptions.CAPABILITY, options);
  		options.merge(cp);
 		
 		
 		//Alerts
 		WebDriver driver=new ChromeDriver(options);
 		driver.get("https://demo.automationtesting.in/Frames.html");
 		driver.findElement(By.linkText("SwitchTo")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.linkText("Alerts")).click();
 		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
 		Thread.sleep(1000);
 		Alert a1 = driver.switchTo().alert();
		a1.accept();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(1000);
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert ale = driver.switchTo().alert();
		String alerttext = ale.getText();
		System.out.println(alerttext);
		ale.sendKeys("Praveen");
		ale.accept();
		
		//Window Handling
		driver.findElement(By.linkText("SwitchTo")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.linkText("Windows")).click();
 		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
 		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
 		System.out.println("Parent Window Title==> "+driver.getTitle());
 		Thread.sleep(1000);
 		
 		
		
}

}
