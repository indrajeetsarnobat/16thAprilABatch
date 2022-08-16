package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeTest
	public void OpenDB() {
		System.out.println("Before Test : Open Database");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("After Test : Close Database");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups="Smoke")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups="Functional")
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups={"Functional","Regression"})
	public void Test3() {
		System.out.println("Test 3");
	}
	
	
	
	
	
	
	
	
	
}
