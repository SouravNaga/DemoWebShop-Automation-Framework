package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	WebElement login_email;
	
	@FindBy(xpath="//input[@id=\"Password\"]")
	WebElement login_password;
	
	@FindBy(xpath="//input[@value=\"Log in\"]")
	WebElement login_btn;
	
	public void enter_login_details(String email,String pwd)
	{
		login_email.sendKeys(email);
		login_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login_btn.click();
	}
}
