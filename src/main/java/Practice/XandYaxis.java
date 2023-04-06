package Practice;

/*
 * Write a script to print x and y co-ordinates of an element. 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XandYaxis {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Point axis = driver.findElement(By.id("email")).getLocation();
		int x=axis.getX();
		int y=axis.getY();
		System.out.println(x);
		System.out.println(y);
		driver.close();

	}

}
