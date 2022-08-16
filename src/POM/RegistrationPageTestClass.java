package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationPageTestClass {

	// test case ==> navigational steps.
	// Scenario ==> Open browser ==> Test Registration page ==> close the browser.
	
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rpage=new RegistrationPage(driver);          //Object Creation ==> Invoke Constructor
	    
		rpage.clickFacebookLoginPageSignupLink();
		rpage.verifyFacebookRegistrationPageFblogo();
		rpage.verifyFacebookRegistrationPageAlreadyAccount();
		rpage.setFacebookRegistrationPageFirstName();
		rpage.setFacebookRegistrationPageLastName();
		rpage.setFacebookRegistrationPageMobileEmail();
		rpage.setFacebookRegistrationPagePassword();
		rpage.setFacebookRegistrationPageBirthDay();
		rpage.setFacebookRegistrationPageBirthMonth();
		rpage.setFacebookRegistrationPageBirthYear();
		rpage.setFacebookRegistrationPageGender("male");
		rpage.clickFacebookRegistrationPageSubmitBtn();
	}
}
