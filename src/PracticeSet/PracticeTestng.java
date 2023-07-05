package PracticeSet;


import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestng {
	
	
	@Test
	public void openUrl() {
		System.out.println("Url is opened");
		Reporter.log("Url is opened");
	}
	
	@Test
	public void login() {
		System.out.println("login is succesfull");
		Reporter.log("Login is succesfull");
	}

	@Test
	public void logout() {
		System.out.println("Logout is succesfull");
		Reporter.log("logut is succesfull");
	}
	
	@BeforeMethod
	public void plugin() {
		
	}
}

