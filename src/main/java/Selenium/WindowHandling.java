package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window Title==> "+driver.getTitle());
		System.out.println("Parent Window ID==> "+driver.getWindowHandle());
		Thread.sleep(1000);
		driver.findElement(By.linkText("This is a link")).click();
		Set<String> ids = driver.getWindowHandles();
		//for (String idnum : ids) {
			//System.out.println(idnum);
		//}
		
		Iterator<String> it = ids.iterator();
		String pwindowid=it.next();
		String cwindowid=it.next();
		System.out.println("Parent Window ID==> "+pwindowid);
		System.out.println("Child window ID==> "+cwindowid);
		
		driver.switchTo().window(cwindowid);
		System.out.println("Child Window Title ==> "+driver.getTitle());
		
		//I want to print the present window title
		driver.switchTo().window(pwindowid);
		System.out.println("Parent Window Title ==> "+driver.getTitle());
		
		driver.close();
		//driver.close();//it will close the window pointed by the driver
		//driver.quit(); //it will close all the window
		
		

	}

}
