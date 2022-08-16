package Basic_TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordsOfTestNG {

	//1.Priority
	
//	@BeforeClass
//	public void OpenURL() {
//		System.out.println("Url is opened");
//	}
//	
//	@Test(priority=1)
//	public void m1() {
//		System.out.println("This is method m1");
//	}
//	
//	@Test(priority=2)
//	public void m2() {
//		System.out.println("This is method m2");
//	}
//	
//	@Test(priority=3)
//	public void m3() {
//		System.out.println("This is method m3");
//	}
//	
//	@AfterClass
//	public void Logout() {
//		System.out.println("Logged out from application");
//	}
	
	//2.Dependsonmethods
	
//	@BeforeClass
//	public void OpenUrl() {
//		System.out.println("Url is opened");
//    }
//	
//	@Test(priority=1)
//	public void m1() {
//		System.out.println("This is method m1");
//		Assert.fail();                             //Fail the test without message
//	}
//	
//	@Test(priority=2,dependsOnMethods = "m1")
//	public void m2() {
//		System.out.println("This is mwthod m2");
//	}
//	
//	@Test(dependsOnMethods = {"m1","m2"})
//	public void m3() {
//		System.out.println("This is method m3");
//	}
//	
//	@AfterClass
//	public void Logout() {
//		System.out.println("Logged out from application");
//	}
	
	//3.invocationCount
	
//	@BeforeMethod
//	public void Login() {
//		System.out.println("Login");
//	}
//	
//	@AfterMethod
//	public void Logout() {
//		System.out.println("Logout");
//	}
//	
//	@Test(priority=2,invocationCount=2)
//	public void HomePage() {
//		System.out.println("Homepage is opened");
//	}
//	
//	@Test(priority=1)
//	public void ProfilePage() {
//		System.out.println("Profilepage is opened");
//	}
//	
//	@BeforeClass
//	public void LaunchBrowser() {
//		System.out.println("Browser is open");
//	}
//	
//	@AfterClass
//	public void CloseBrowser() {
//		System.out.println("Browser is Closed");
//	}
	
	//4.enabled=false
//	@BeforeMethod
//	public void Login() {
//		System.out.println("Login");
//	}
//	
//	@AfterMethod
//	public void Logout() {
//		System.out.println("Logout");
//	}
//	
//	@Test(enabled=false)
//	public void HomePage() {
//		System.out.println("Homepage is opened");
//	}
//	
//	@Test()
//	public void ProfilePage() {
//		System.out.println("Profilepage is opened");
//	}
//	
//	@BeforeClass
//	public void LaunchBrowser() {
//		System.out.println("Browser is open");
//	}
//	
//	@AfterClass
//	public void CloseBrowser() {
//		System.out.println("Browser is Closed");
//	}
	
	//5.timeouts
//	@BeforeClass
//	public void LaunchBrowser() {
//			System.out.println("Browser is open");
//	}
//		
//	@AfterClass
//	public void CloseBrowser() {
//			System.out.println("Browser is Closed");
//	}
//	
//	@BeforeMethod
//	public void Login() {
//	     System.out.println("Login");
//	}
//		
//	@AfterMethod
//	public void Logout() {
//			System.out.println("Logout");
//	}
//		
//	@Test(timeOut=5000)
//	public void HomePage() throws InterruptedException {
//		    Thread.sleep(6000);                      //if thread.sleep<timeOut ==> TC will Success & if thread.sleep>timeOut ==> TC will Fail
//			System.out.println("Homepage is opened");	
//	}
//		
//	@Test()
//	public void ProfilePage() {
//		System.out.println("Profilepage is opened");
//	}
		
	
}
