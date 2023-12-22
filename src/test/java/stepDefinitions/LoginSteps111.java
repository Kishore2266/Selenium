package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps111 {

	public static WebDriver driver;
	
	LoginPage lp;



	@Given("browser is open")
	public void browser_is_open() {

		driver=new ChromeDriver();

	}

	@Given("user is in Login page")
	public void user_is_in_login_page() {
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {

		lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
		

	}

	@When("user clicks Login button")
	public void user_clicks_login_button() {

		lp.clickLoginbtn();

	}

	@Then("user navigated to the respected page")
	public void user_navigated_to_the_respected_page() {

		String Exp_result="Adactin.com - Search Hotel";
		String Act_result=driver.getTitle();

		if(Act_result.equals(Exp_result)) {

			System.out.println("testcase is passed");
		}else
		{
			System.out.println("test case is failed");
		}

	}


}
