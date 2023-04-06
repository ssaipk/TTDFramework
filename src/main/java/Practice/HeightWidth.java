package Practice;

/*
 * Write a code to print height and width of the code
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeightWidth {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Dimension hw = driver.findElement(By.id("email")).getSize();
		int h=hw.getHeight();
		int w=hw.getWidth();
		System.out.println(h);
		System.out.println(w);
		driver.close();

	}

}
