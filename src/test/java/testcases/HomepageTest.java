package testcases;

import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.LoginPage;

public class HomepageTest extends Baseclass{
	
	@Test 
	public void Tc_001() throws Exception {
		LoginPage lp=new LoginPage();
		lp.loginToApp("standard_user", "secret_sauce");
		lp.validateSuccessMessage("Products");
		Homepage hp=new Homepage();
		
		hp.AddCart();
		hp.enterinput("Harshal", "Harshal", "500072");
		hp.validateSuccessOrder("THANK YOU FOR YOUR ORDER");
	}
	

}
