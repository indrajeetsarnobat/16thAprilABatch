package BeforeAfterTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {

//Scenario ==>OpenDB-->OpenBrowser-->m1,m2,m3-->CloseBrowser-->OpenBrowser-->m4,m5,m6-->CloseBrowser-->CloseDB	
//DataBase -->Open & close Once
//Browser -->Open & close Twice
	
	//Before & After Test always use only one time at the start of 1st class or at the end of 2nd class
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("Database opened");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("Database Closed");
	}
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("Open the browser");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}
	
}
