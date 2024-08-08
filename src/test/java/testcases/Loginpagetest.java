package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class Loginpagetest extends Baseclass {

	@Test(priority = 0)
	public void Tc_001() {
		LoginPage lp = new LoginPage();
		lp.loginToApp("standard_user", "secret_sauce");
		lp.validateSuccessMessage("Products");
	}

	@Test(priority = 1)
	public void Tc_002() {
		LoginPage lp = new LoginPage();
		lp.loginToApp("standard_user1", "secret_sauce1");
		lp.validateErrorMessage("Epic sadface: Username and password do not match any user in this service");
	}

	@Test(priority = 2)
	public void Tc_003() {
		LoginPage lp = new LoginPage();
		lp.loginToApp("locked_out_user", "secret_sauce");
		lp.validateErrorMessage("Epic sadface: Sorry, this user has been locked out.");
		
	}

}
