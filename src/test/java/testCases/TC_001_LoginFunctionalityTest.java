package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginFunctionalityTest extends BaseClass{

	@Test(groups= {"sanity","master"})
	public void verify_login_functionality() {
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		hp.clickLogin();
		lp.enter_login_details("souravnaga70@gmail.com", "123456");
		lp.clickLogin();
		System.out.println(hp.find_username());
	}
}
