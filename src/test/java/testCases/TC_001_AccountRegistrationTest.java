package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"regression","master"})
	public void verify_account_registration() {
		
		logger.info("****starting TC_001_AccountRegistrationTest ****");
		
		try {
			HomePage hp = new HomePage(driver);
			AccountRegistrationPage arg = new AccountRegistrationPage(driver);
			hp.clickRegister();
			logger.info("clicked on registration link");
			arg.genderclick("female");
			logger.info("gender clicked successfully");
			arg.enterdetails(randomeString(), randomeString(), generateGmail(), "123456", "123456");
			logger.info("all details are entered successfully");
			arg.clickRegister();
			logger.info("Registration button clicked successfully");
			String actual = hp.verify_successful_register_msg();
//			Assert.assertEquals(actual, "Your registration completed");
			logger.info("verification started .....");
			if(actual.equals("Your registration completed")) {
				logger.info("test passed .....");
				Assert.assertTrue(true);
			}
			else {
				logger.error("test failed");
				Assert.fail();
			}
			System.out.println(hp.find_username());
		}
		catch(Exception e) {
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("****Finished TC_001_AccountRegistrationTest ****");
		
	}
	
	

}
