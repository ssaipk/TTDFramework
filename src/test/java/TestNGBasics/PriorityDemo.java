package TestNGBasics;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = -1)
	public void zebra() {
		System.out.println("Zebra");
	}
	
	@Test(priority = 3)
	public void banana() {
		System.out.println("Banana");
	}
	
	@Test(priority = 2)
	public void apple() {
		System.out.println("Apple");
	}
	
	@Test(priority = 4)
	public void Abc() {
		System.out.println("ABC");
	}
	
	@Test
	public void grapes() {
		System.out.println("Grapes");
	}
	
	
}
