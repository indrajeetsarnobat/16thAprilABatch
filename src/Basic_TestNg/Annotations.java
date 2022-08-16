package Basic_TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	//Scenario No.1 -->Login-openurl-Logout-Login-HomePage-Logout-Login-Notification-Logout
	
//	@BeforeMethod
//	public void Login() {
//		System.out.println("Login into the application");
//	}
//	
//	@AfterMethod
//	public void Logout() {
//		System.out.println("Logout From the application");
//	}
//	
//	@Test(priority = 1)
//	public void OpenUrl() {
//		System.out.println("Open the URl");
//		Reporter.log("Open URL");
//	}
//	
//	@Test(priority = 2)
//	public void HomePage() {
//		System.out.println("HomePage will show all Features");
//		Reporter.log("HomePage will open");
//	}
//	
//	@Test(priority = 3)
//	public void Notification() {
//		System.out.println("WE can see notifications here");
//		Reporter.log("Notification will open");
//	}
	
	//Scenario No.2 -->Login-Openurl-HomePage-Notification-Logout
	
	@BeforeClass
	public void Login() {
		System.out.println("Login Into the page");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("Logout from the page");
	}
	
	@Test
	public void OprenURL() {
		System.out.println("Open URL");
		Reporter.log("Open URL");
	}
	
	@Test
	public void HomePage() {
		System.out.println("HomePage will open");
		Reporter.log("HomePage will open");
	}
	
	@Test
	public void Notification() {
		System.out.println("Notification menu");
		Reporter.log("Notification menu");
	}
		
}
