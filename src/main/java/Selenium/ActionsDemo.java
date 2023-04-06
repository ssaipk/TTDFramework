package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ActionsDemo {

	public static void main(String[] args) {
		hover();
		//keyboardevents();
		//clicks();
		//scrolling();
	}
	
	public static void hover() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		WebElement kidsoption = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act=new Actions(driver);
		act.moveToElement(kidsoption).perform();
	}
	
	public static void keyboardevents() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
		Actions act=new Actions(driver);
		act.moveToElement(username).keyDown(Keys.SHIFT).sendKeys("praveenkumar").keyUp(Keys.SHIFT);
		act.keyDown(Keys.TAB).perform();
	}
	
	public static void clicks() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement username = driver.findElement(By.name("email"));
		//act.doubleClick().perform();
		act.contextClick(username).perform();
		
	}
	
	public static void scrolling() {
		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*");
 		DesiredCapabilities cp=new DesiredCapabilities();
 		cp.setCapability(ChromeOptions.CAPABILITY, options);
 		options.merge(cp);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		/*
		 * scrolling parameters first parameter: X-axis used to scroll left(-ve) and
		 * right(+ve)
		 * second parameter: Y-axis used to scroll up (-ve) and down(+ve)
		 */
		
		//act.scrollByAmount(0,  600).perform();
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Grocery']"));
		act.scrollToElement(scroll).perform();
	
	}
	
	public static void draganddrop() {
		
		/*
		 * open the site
		 * identify the source webelement
		 * identify the target webelement
		 * create Actions obj
		 * call dragandDrop method using obj and pass the source and target as a parameter
		 */
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
		driver.findElement(By.id("draggable"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
