package selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//a[normalize-space()='Login or register']")
	WebElement loginButton;
	
	@FindBy(id="loginFrm_loginname")
	WebElement userEmail;
	
	@FindBy(id="loginFrm_password")
	WebElement userPass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement submit;
	
	@FindBy(linkText="Edit account details")
	WebElement editAcc;

	public accountPage loginPage(String email, String password) {
		loginButton.click();
		userEmail.sendKeys(email);
		userPass.sendKeys(password);
		submit.click();
		editAcc.click();
		accountPage accountPage = new accountPage(driver);
		return accountPage;
	}
	
	public void websiteURL() {
		driver.get("https://automationteststore.com/");

	}

}
