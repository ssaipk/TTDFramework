package TestNGBasics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider="getData")
	public void login(String uname,String pwd) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}

	@org.testng.annotations.DataProvider
	public Object[][] getData() {
		/*
		 * First Parameter: indicates how many rows or how many times we want to
		 *                  execute the TC
		 * Second Parameter: indicates how many values to send for each iteration.
		 */
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="ajay";
		data[1][1]="admin123";
		
		data[2][0]="hr";
		data[2][1]="hr123";
		
		return data;
	}
	@Test(dataProvider="getDataFromExcel")
	public void loginUsingExcelData(String uname,String pwd) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}
	@org.testng.annotations.DataProvider
	public Object[][] getDataFromExcel() throws IOException {
		ExcelReader reader=new ExcelReader();
		return reader.getData();
	}
	
	
}	
