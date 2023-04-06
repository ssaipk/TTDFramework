package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void login() {
		System.out.println("Validating Login");
		//Assert.fail("Login is not working");
	}
	
	@Test(dependsOnMethods = {"login"})
	public void sendFriendRequest() {
		System.out.println("Sending friend request");
		Assert.fail("Sending friend request is not working");
	}
	
	@Test(dependsOnMethods = {"login","sendFriendRequest"})
	public void acceptFriendRequest() {
		System.out.println("Accepting Friend Request");
	}
	
	@Test
	public void forgotPassword() {
		System.out.println("Testing forgot password");
	}

}
