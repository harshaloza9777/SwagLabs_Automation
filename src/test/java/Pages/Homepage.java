package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.Baseclass;

public class  Homepage extends Baseclass {
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement Product;
	
	@FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
	WebElement Addtocart;
	
	@FindBy(xpath = "//*[@data-icon='shopping-cart']")
	WebElement MiniCart;
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement Checkout;

	@FindBy (id ="first-name")
	WebElement FirstName;
	
	@FindBy (id="last-name")
	WebElement LastName;
	
	@FindBy (id="postal-code")
	WebElement Postalcode;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Continue;
	
	@FindBy(xpath = "//a[@class='btn_action cart_button']")
	WebElement FinishBtn;
	
	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
	WebElement ConfirmMess;

	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String valiateTitle() {
	return	driver.getTitle();
	}
	public void AddCart() throws Exception {
		Thread.sleep(4000);
		Product.click();
		Addtocart.click();
		MiniCart.click();
		Checkout.click();
		
	}
	public void enterinput (String fn, String ln, String pin) throws InterruptedException {
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		Postalcode.sendKeys(pin);
		Thread.sleep(4000);
		Continue.click();
		FinishBtn.click();
		
	}

	public void validateSuccessOrder(String ExceptSuccess) {
		// TODO Auto-generated method stub
		String ActualMessage = ConfirmMess.getText();
		Assert.assertEquals(ActualMessage, ExceptSuccess);
	}

}
