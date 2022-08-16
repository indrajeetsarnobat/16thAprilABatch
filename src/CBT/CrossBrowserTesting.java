package CBT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver;
	@Parameters("browser")
	@Test(priority = 1)
	public void crossBrowserTesting(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Omkar\\Desktop\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2)
	public void getcurrentURL() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	}
		
	@Test(priority=3)
	public void gettitle() {
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}
	
	@Test(priority=4)
	public void VerifyUsenameField() {
	      WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	      Assert.assertTrue(Username.isDisplayed());
	      Username.sendKeys("Indrajeet");
	}
	
	@Test(priority=5)
	public void VerifyPasswordField() {
	      WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	      Assert.assertTrue(Password.isEnabled());
	      Password.sendKeys("23456345@323sda");
	}
	
	@Test(priority=6)
	public void ClickLoginBtn() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
		
}
