package POM;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {

	    //Declaration
		//Object Repository ==>Place Where All Objects are stored using Xpath in Pom Class
		
		@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fbLogo;  
		@FindBy(xpath="(//h2[contains(text(),'Facebook helps you connect and share with the peop')])[1]")private WebElement login_fbtagline;      
		@FindBy(xpath="(//input[@id='email'])[1]")private WebElement username;             
		@FindBy(xpath="(//input[@id='pass'])[1]")private WebElement password;                                 
		@FindBy(xpath="(//button[normalize-space()='Log In'])[1]")private WebElement loginbtn;                         
		@FindBy(xpath="(//a[normalize-space()='Forgotten password?'])[1]")private WebElement forgotten_password;                    
		@FindBy(xpath="(//a[normalize-space()='Create New Account'])[1]")private WebElement createnew_accbtn;             
		@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//li/a")})private List<WebElement> footerlinks;
		
		//Initialization ==> With argument constructor is used
		
		public LoginPage(WebDriver driver) {			
			PageFactory.initElements(driver,this);
		}
	
		//Usage
		
		public void verifyFacebookLoginPageLogo() {
			Assert.assertTrue(login_fbLogo.isDisplayed(),"Facebook logo is not displayed on login page");
			Reporter.log("verifyFacebookLoginPageLogo",true);
		}
		
		public void verifyFacebookLoginPageTagline() {
			Assert.assertTrue(login_fbtagline.isDisplayed());
			Assert.assertEquals(login_fbtagline.getText(),"Facebook helps you connect and share with the people in your life.");
			Reporter.log("verifyFacebookLoginPageTagline",true);
		}
		
		public void verifyFacebookLoginPageUsername() {
			username.sendKeys("Indrajeet");
			Reporter.log("verifyFacebookLoginPageUsername");
		}
		
		public void verifyFacebookLoginPageUsernamePassword() {
			username.sendKeys("Indra@123132");
			Reporter.log("verifyFacebookLoginPagePassword");
		}
		
		public void verifyFacebookLoginPageForgotPassword() {
			Assert.assertTrue(forgotten_password.isDisplayed());
			Assert.assertEquals(forgotten_password.getText(),"Forgotten password?");
			Reporter.log("verifyFacebookLoginPagePassword");
		}
		
		public void verifyFacebookLoginBtn() {
			Assert.assertTrue(loginbtn.isDisplayed());
			loginbtn.click();
			Reporter.log("verifyFacebookLoginBtn");
		}
		
//		public void verifyFacebookCreateNewAccountBtn() {
//			Assert.assertTrue(createnew_accbtn.isDisplayed());
//			createnew_accbtn.click();
//			Reporter.log("verifyFacebookCreateNewAccountBtn");
//		}
		
		public void verifyFacebookLoginPageFooterlinks() {
			Assert.assertEquals(footerlinks.size(),31);
			Reporter.log("verifyFacebookLoginPageFooterlinks",true);
		}		
		
}
