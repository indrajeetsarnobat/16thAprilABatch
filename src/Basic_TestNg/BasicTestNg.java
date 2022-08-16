package Basic_TestNg;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicTestNg {

	@Test                                      //it is an annotation which replace the main method
	public void OpenUrl() {
		System.out.println("openurl");
		Reporter.log("Open the URL");          //It opens Test-output option
	}
	
	@Test
	public void login() {
		System.out.println("Login");
		Reporter.log("Login to the URL");
	}
	
	@Test
	public void logout() {
		System.out.println("Logout");
		Reporter.log("Logout from the URL");
	}		
}
