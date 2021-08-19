package a.testCases;

import org.testng.annotations.Test;

public class TC_Login_1 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.clickOnSignIn();
		lp.enterOnEmailId();
		lp.enterOnPassword();
		lp.clickOnLogin();
		lp.closeBanner();
		lp.clickOnShop();
		lp.clickOnViewAll();
	}
	

}
