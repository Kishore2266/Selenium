package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass  {
	
	
	public  WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//identify the webelements
	
	@FindBy(id="username")
	WebElement txtUsername;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	//create associated methods
	
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginbtn() {
		btnLogin.click();
	}
	
	public void entersusernameandpassword(String username,String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
	}

}
