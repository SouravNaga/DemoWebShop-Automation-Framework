package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_002_LoginFunctionalityTest extends BaseClass{
	

	@Test(dataProvider="LoginData1",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String username, String password, String exp) {
		
		System.out.println("hi");
		System.out.println(username);
		
		logger.info("**** Started TC_003_LoginDDT *****");
		try {
			HomePage hp = new HomePage(driver);
			LoginPage lp = new LoginPage(driver);
			hp.clickLogin();
			logger.info("**** Login link clicked *****");
			lp.enter_login_details(username, password);
			logger.info("**** Data entered successfully *****");
			lp.clickLogin();
			logger.info("**** Login button clicked *****");
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.verify_logout_btn_existance();
			if(exp.equalsIgnoreCase("valid")) {
				if(targetPage==true)
				{
					System.out.println(hp.find_username());
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					logger.info("**** Test failed *****");
					Assert.assertTrue(false);
				}
			}
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
					logger.info("**** Test failed *****");
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			
		}
		
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
			logger.error("Test failed");
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
		
	}
}
