package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class Loginpagetest extends Baseclass{

	@Test(priority=0)
	public void Tc_001() {
	LoginPage lp=new LoginPage();
	lp.loginToApp("standard_user", "secret_sauce");
	lp.validateSuccessMessage("Products");
}
	@Test(priority=1)
	public void Tc_002() {
	LoginPage lp=new LoginPage();
	lp.loginToApp("standard_user1", "secret_sauce1");
	lp.validateErrorMessage("Epic sadface: Username and password do not match any user in this service");
}
	@Test(priority=2)
	public void Tc_003() {
	LoginPage lp=new LoginPage();
	lp.loginToApp("locked_out_user","secret_sauce");
	lp.validateErrorMessage("Epic sadface: Sorry, this user has been locked out.");
	}
	
	@Test(priority=3)
	public void Tc_004() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("Sauce_Labs_Backpack","secret_sauce");
		lp.validateLogedUserMessage("click on Sauce Labs Backpack");
	}
	
	@Test(priority=4)
	public void Tc_006( ) {
		LoginPage lp=new LoginPage();
		lp.loginToApp("AddToCart button", "secret_sauce");
		lp.validateLogedUserMessage("Click On Add To Cart");
	}
	
	@Test(priority=5)
	public void Tc_007() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("MiniCartLocated", "secret_sauce");
		lp.validateAddToCart("Mini Cart Located");
	}
	
	@Test(priority = 6)
	
	public void Tc_008() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("checkout", "secret_sauce");
		lp.validateCheckOut("checkout");
	}
	
	@Test(priority = 7)
	
	public void Tc_009() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("FirstName", "secret_sauce");
		lp.validatefirstName("FirstName");
		
	}
	
	@Test(priority = 8)
	
	public void Tc_0010() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("LastName", "secret_sauce");
		lp.validatelastName("LastName");
		}
	
	@Test(priority = 9)
	
	public void Tc_011() {
		LoginPage lp=new LoginPage();
		lp.loginToApp("PostalCode", "secret_sauce");
		lp.validatePostalCode("PostalCode");
	}
	
}



