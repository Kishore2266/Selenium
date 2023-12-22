package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage111;
import io.cucumber.java.en.*;

public class RegistrationPageSteps111 {
	
	public WebDriver driver;
	RegistrationPage111 rp;
	@Given("browser is opened")
	public void browser_is_opened() {
	    
		driver=new ChromeDriver();
	}

	@Given("user is in RegistrationPage")
	public void user_is_in_registration_page() {
		
		driver.get("https://adactinhotelapp.com/index.php");
	   rp=new RegistrationPage111(driver);
		
	   rp.ClickRegisterlink();
	}

	@When("user enters required credentials")
	public void user_enters_required_credentials( ) throws InterruptedException {
		
		rp.setUserUsername();
		rp.setUserPassword();
		rp.setRepassword();
		rp.setFullname();
		rp.setEmailAddress();
		
		Thread.sleep(20);
		rp.ClickTermsandConditions();
		
		
	    
	}

	@When("user click Register button")
	public void user_click_register_button() {
	   
		rp.clickRegisterBtn();
	}

	@Then("user is navigated to the selectHotel Page")
	public void user_is_navigated_to_the_select_hotel_page() {
	 
		System.out.println("testcase is passed");
	}

}
