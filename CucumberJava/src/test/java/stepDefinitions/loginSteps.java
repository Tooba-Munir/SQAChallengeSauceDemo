package stepDefinitions;

import org.openqa.selenium.WebDriver;
import Handler.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class loginSteps {
	private WebDriver driver;
	LoginPage login;
 



	
	   @Before 
		public void setUp() {
			
		    driver= DriverManager.getDriver();
			login = new LoginPage(driver);

		}

	 	
  
	@After
	public void teardown() {
		DriverManager.quitDriver();
	}
	
	


	@Given("user is on login page")
	public void user_is_on_login_page() {
		login.loginPage();
	}

	@When("^user enters valid (.*) and valid (.*)$")
	public void user_enters_valid_username_and_valid_password(String username, String password) {
		login.enterUsernameAndPassword(username, password);
	}



	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLoginBtn();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		login.validateIfNavigatesToHomePage();
		Thread.sleep(2000);

	}

	@When("^user enters blocked (.*) and (.*)$")
	public void user_enters_blocked_username_and_password(String username,String password) {
		login.enterUsernameAndPassword(username, password);
	}

	@Then("user sees error message and is not logged in")
	public void user_sees_error_message_and_is_not_logged_in() {
		login.errorMessage();
			}



}