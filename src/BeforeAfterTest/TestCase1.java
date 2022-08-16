package BeforeAfterTest;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Scenario 3:OpenDB-->(Class 1)-->m1,m2,m3-->(Class 2)-->m4,m5,m6-->CloseDB

public class TestCase1 {

	//Before & After Test always use only one time at the start of 1st class or at the end of 2nd class
	@BeforeTest
	public void OpenDB() {
		System.out.println("Database is opened");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("Database is closed");
	}
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
		Reporter.log("This is method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2");
		Reporter.log("This is method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3");
		Reporter.log("This is method m3");
	}	
}
