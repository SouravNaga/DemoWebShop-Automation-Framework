package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement male;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement female;
	
	@FindBy(xpath="//input[@id=\"FirstName\"]")
	WebElement fname;
	
	@FindBy(xpath="//input[@id=\"LastName\"]")
	WebElement lname;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"ConfirmPassword\"]")
	WebElement confirm_password;
	
	@FindBy(xpath="//input[@id=\"register-button\"]")
	WebElement register_btn;
	
	
	public void genderclick(String gender)
	{
		if(gender.equalsIgnoreCase("male")) {
			male.click();
		}
		else {
			female.click();
		}
	}
	public void enterdetails(String firstname,String lastname, String email_val,String pwd,String confirm_pwd) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		email.sendKeys(email_val);
		password.sendKeys(pwd);
		confirm_password.sendKeys(confirm_pwd);
		
	}
	public void clickRegister()
	{
		register_btn.click();
	}
}
