package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC2 {

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups="Smoke")
	public void Test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups="Functional")
	public void Test5() {
		System.out.println("Test 5");
	}
	
	@Test(groups={"Functional","Regression"})
	public void Test6() {
		System.out.println("Test 6");
	}
	
	
}
