package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(xpath="//div[@class=\"result\"]")
	WebElement successful_register_msg;
	
	@FindBy(xpath="//div[@class='header-links']//a[@class=\"account\"]")
	WebElement successful_register_username;
	
	public String verify_successful_register_msg() {
		String actText = successful_register_msg.getText();
		return actText;
	}
	
	public String find_username() {
		return successful_register_username.getText();
	}
	public void clickRegister() {
		register.click();
	}
	public void clickLogin() {
		login.click();
	}
}
