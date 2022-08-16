package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC3 {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups="Smoke")
	public void Test7() {
		System.out.println("Test 7");
	}
	
	@Test(groups="Functional")
	public void Test8() {
		System.out.println("Test 8");
	}
	
	@Test(groups={"Functional","Regression"})
	public void Test9() {
		System.out.println("Test 9");
	}

}
