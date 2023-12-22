package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage111 extends BaseClass {
	
	public RegistrationPage111(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement newuserregisterlink;
	
	@FindBy(id="username")
	WebElement txtrusername;
	
	@FindBy(id="password")
	WebElement txtrpassword;
	
	@FindBy(id="re_password")
	WebElement re_password;
	
	@FindBy(id="full_name")
	WebElement txtFullname;
	
	@FindBy(id="email_add")
	WebElement emailadd;
	
	@FindBy(id="tnc_box")
	WebElement Termsandco;
	
	@FindBy(id="Submit")
	WebElement btnRegister;
	
	//create the methods
	
	public void ClickRegisterlink() {
		newuserregisterlink.click();
	}
	public void setUserUsername() {
		txtrusername.sendKeys("Naveendarapu");
	}
	
	public void setUserPassword() {
		 txtrpassword.sendKeys("Naveen@123");
	}
	
	public void setRepassword() {
		re_password.sendKeys("Naveen@123");
	}
	
	public void setFullname() {
		txtFullname.sendKeys("Naveendarapu");
	}
	
	public void setEmailAddress() {
		emailadd.sendKeys("abcd11@gmail.com");
	}
	
	public void ClickTermsandConditions() {
		Termsandco.click();
	}

	public void clickRegisterBtn() {
		btnRegister.click();
	}
}
