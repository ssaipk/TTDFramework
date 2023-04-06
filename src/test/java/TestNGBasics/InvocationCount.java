package TestNGBasics;

import org.testng.annotations.Test;

public class InvocationCount {
		
	@Test(invocationCount = 3)
		public void m1() {
			System.out.println("Multiple times executed");
	}

}
