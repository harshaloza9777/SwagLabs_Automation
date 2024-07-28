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
	
	@FindBy(xpath="//h3@id=\"item_4_title_link")
	WebElement baElement;
	
	@FindBy(xpath="//div[rext()='btn_primary']")
	WebElement ADDTOCART;
	
	@FindBy(xpath="//div[rext()='fa-layers-counter shopping_cart_badge']")
	WebElement MiniCartLocated;
	
	@FindBy(xpath ="btn actioncheckoutbutton")
	WebElement checkout;
	
	@FindBy(xpath = "//[id=\"first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath = "last-name")
	WebElement LastName;
	
	@FindBy(xpath = "postal-code")
	WebElement PostalCode;
	
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
	
	public void validateSauceLabsBackpack(String ExpclickBackPack) {
		@SuppressWarnings("unused")
		String ActualBackPack=ExpclickBackPack.stripTrailing();
		
	}
	
	public void validateAddToCart(String ExpAddToCart) {
		String ActualAddToCart=ADDTOCART.getText();
		Assert.assertEquals(ActualAddToCart,ExpAddToCart);
	}
	
	public void validateMiniCartLocated(String ExpMiniCartLocated) {
		int ActualMiniCartLocated=ExpMiniCartLocated.length();
		Assert.assertEquals(ActualMiniCartLocated, ExpMiniCartLocated);		
	}
	
	public void validateCheckOut(String ExpCheckOut) {
		byte[] ActualCheckOut=ExpCheckOut.getBytes();
		Assert.assertEquals(ActualCheckOut, ExpCheckOut);
	}
	public void validatefirstName(String ExpfirstName) {
		String ActualfirstName=firstName.getText();
		Assert.assertEquals(ActualfirstName,ExpfirstName);
	}
	public void validatelastName(String ExpLastName) {
		String ActualLastName=LastName.getText();
		Assert.assertEquals(ActualLastName,ExpLastName);
	}
	public void validatePostalCode(String ExpPostalCode) {
		String ActualPostalCode=PostalCode.getText();
		Assert.assertEquals(ActualPostalCode,ExpPostalCode);
	}
}
