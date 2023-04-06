package TestNGBasics;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"mobile"})
	public void mobileTC1() {
		System.out.println("Mobile Tc1");
	}

	@Test (groups= {"mobile"})
	public void mobileTC2() {
		System.out.println("Mobile Tc2");
	}

	@Test(groups= {"web"})
	public void webTC1() {
		System.out.println("Web Tc1");
	}
	@Test (groups= {"web"})
	public void webTC2() {
		System.out.println("Web Tc2");
	}
	
	@Test
	public void test() {
		System.out.println("Exclude method worked");
	}

}
