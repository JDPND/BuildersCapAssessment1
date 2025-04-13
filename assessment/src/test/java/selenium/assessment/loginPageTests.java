package selenium.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPageTests {
	
	@Test
	public void basicTestScript() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginPage loginPage = new loginPage(driver);
		loginPage.websiteURL();
		accountPage accountPage = loginPage.loginPage("jdpnd", "Automation1234$");
		
		accountPage.positiveEmail();
		String successMessage = accountPage.getSuccess();
		Assert.assertTrue(successMessage.equalsIgnoreCase("Success: Your account has been successfully updated."));
		
		accountPage.negativeEmail("jdpnd");
		Assert.assertEquals(accountPage.getError(), "E-Mail Address does not appear to be valid!");
		driver.close();
	}

}
