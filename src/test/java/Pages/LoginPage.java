package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.Baseclass;

public class LoginPage extends Baseclass{

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[text()='Products']")
	WebElement SuccessMessage;
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement ErrorMessage;
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement LogedMessage;
	
	
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	public void loginToApp(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
	}
	public void validateSuccessMessage(String ExpMessage) {
		String ActualMessage=SuccessMessage.getText();
		Assert.assertEquals(ActualMessage, ExpMessage);
	}
	public void validateErrorMessage(String ExMessage) {
		String ActualMessage=ErrorMessage.getText();
		Assert.assertEquals(ActualMessage, ExMessage);
	}

	public void validateLogedUserMessage(String ExpLogedMessage) {
		String ActualLogedMessage=LogedMessage.getText();
		Assert.assertEquals(ActualLogedMessage,ExpLogedMessage);
	}
	
	
}
