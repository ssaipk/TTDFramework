package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FramesDemo {
	/*
	 * Switching to the frames
	 * 1.Index
	 * 2.Id or Name
	 * 3.Web element
	 */

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/tinymce");
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("Count of frames==>> "+frame.size());
		//first switch to the frame
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("mce_0_ifr");
		WebElement target = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Praveen Kumar");

		//Switch back to driver page
		//driver.switchTo().parentFrame();// used if there are nested frames
		//driver.switchTo().defaultContent();
	}

}
