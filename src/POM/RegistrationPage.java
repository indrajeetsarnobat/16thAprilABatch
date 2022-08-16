package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {

	//Declaration
	//Object Repository ==>Place Where All Objects are stored using Xpath in Pom Class
	
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']")private WebElement reg_fbLogo;  
	@FindBy(xpath="//a[text()='Already have an account?']")private WebElement already_acc;      
	@FindBy(xpath="//a[normalize-space()='Sign Up']")private WebElement signuplink;             
	@FindBy(xpath="//input[@name='firstname']")private WebElement firstname;                                 
	@FindBy(xpath="//input[@name='lastname']")private WebElement surname;                         
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement mob_email;                    
	@FindBy(xpath="//input[@type='password']")private WebElement password;             
	@FindBy(name="birthday_day")private WebElement birthday;
	@FindBy(name="birthday_month")private WebElement birthmonth;
	@FindBy(name="birthday_year")private WebElement birthyear;
	@FindBy(xpath="//label[normalize-space()='Female']")private WebElement gender_female;
	@FindBy(xpath="//label[normalize-space()='Male']")private WebElement gender_male;
	@FindBy(name="websubmit")private WebElement submitbtn;
	
	//Initialization ==> With argument constructor is used
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);      //PageFactory ==> Class,initElements==>Method
	}
	
	//Usage
	
	public void clickFacebookLoginPageSignupLink() {
		signuplink.click();
	}
	
	public void verifyFacebookRegistrationPageFblogo() {
		Assert.assertTrue(reg_fbLogo.isDisplayed(),"Facebook Logo is not displayed on registration page");
	}	
	public void verifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"Facebook already have an account option is not displayed on registration page");		
		Assert.assertTrue(already_acc.isEnabled(),"Facebook already have an account option is not displayed on registration page");
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
	}
	
	public void setFacebookRegistrationPageFirstName() {
		firstname.sendKeys("Indrajeet");
	}
	
	public void setFacebookRegistrationPageLastName() {
		surname.sendKeys("Sarnobat");
	}
	
	public void setFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("8951113453");
	}
	
	public void setFacebookRegistrationPagePassword() {
		password.sendKeys("Velocity@323");
	}
	
	public void setFacebookRegistrationPageBirthDay() {
		Select Day=new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(),"BirthDay Option is not Displayed");
		Assert.assertFalse(birthday.isSelected());
		Day.selectByVisibleText("19");
	}
	
	public void setFacebookRegistrationPageBirthMonth() {
		Select Month=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(),"BirthMonth Option is not Displayed");
		Assert.assertFalse(birthmonth.isSelected());
		Month.selectByVisibleText("Mar");
	}
	
	public void setFacebookRegistrationPageBirthYear() {
		Select Year=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(),"BirthMonth Option is not Displayed");
		Assert.assertFalse(birthyear.isSelected());
		Year.selectByVisibleText("2000");
	}
	
	public void setFacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else {
			System.out.println("The Wrong input selected by user");
		}
	}
	
	public void clickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}	
	
}
