package selenium.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountPage {
	
WebDriver driver;
	
	public accountPage(WebDriver driver)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//ul[@class='side_account_list']//a[@href='https://automationteststore.com/index.php?rt=account/edit']")
	WebElement editAcc;
	
	@FindBy(id="AccountFrm_email")
	WebElement editEmail;
	
	
	@FindBy(xpath="//button[@title='Continue']")
	WebElement Continue;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement successMessage;
	
	@FindBy(xpath = "//span[text()='E-Mail Address does not appear to be valid!']")
	WebElement errorMessage;

	
	public void positiveEmail() {
		editAcc.click();
		Continue.click();
	}
	
	public String getSuccess() {
		String message = successMessage.getText();
	    String extracted = message.substring(message.indexOf("Success"));
	    return extracted;
	}
	
	public void negativeEmail(String invalidEmail) {
		editAcc.click();
		editEmail.clear();
		editEmail.sendKeys(invalidEmail);
		Continue.click();
	}
	
	public String getError() {
		return errorMessage.getText();
	}

}


