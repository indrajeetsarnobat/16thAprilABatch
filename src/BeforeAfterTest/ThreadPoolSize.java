package BeforeAfterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {

	@Test (invocationCount = 5, threadPoolSize = 5)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}