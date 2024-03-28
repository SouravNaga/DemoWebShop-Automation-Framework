package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	WebDriver driver;
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(linkText="Log out")
	WebElement log_out_btn;
	
	@FindBy(xpath="//div[@class='header-links']//a[@class=\"account\"]")
	WebElement successful_register_username;
	
	public boolean verify_logout_btn_existance() {
		try {
			return (log_out_btn.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void clickLogout() {
		log_out_btn.click();

	}
	
	public String find_username() {
		return successful_register_username.getText();

	}
}
