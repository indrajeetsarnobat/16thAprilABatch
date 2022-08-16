package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

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
	public void FacebookLoginPageTest() {
	
		LoginPage login = new LoginPage(driver);
	    login.verifyFacebookLoginPageLogo();
	    login.verifyFacebookLoginPageTagline();
	    login.verifyFacebookLoginPageUsername();
	    login.verifyFacebookLoginPageUsernamePassword();
	    login.verifyFacebookLoginPageForgotPassword();
	    login.verifyFacebookLoginBtn();
	    //login.verifyFacebookCreateNewAccountBtn();
	    login.verifyFacebookLoginPageFooterlinks();
		
	}		
}
