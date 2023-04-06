package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	@AfterSuite
	public void sendReport() {
		System.out.println("Sending the report");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open the browser");
		System.out.println("Launch the application");
	}
	
	@Test
	public void validateTitle() {
		System.out.println("Validating title test case");
	}
	
	@Test
	public void validateLogin() {
		System.out.println("Validating login test case");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the browser");
		System.out.println();
	}

}
