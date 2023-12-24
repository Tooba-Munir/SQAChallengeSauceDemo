package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Handler.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogOutPage;
import pages.LoginPage;

public class logoutSteps {
	
	private WebDriver driver;
	LogOutPage logout;
    LoginPage login;

	
	@Before
	public void setUp() {
		driver = DriverManager.getDriver();
		logout = new LogOutPage(driver);
		login = new LoginPage(driver);
	}
	
	@After
	public void tearDown() {
		DriverManager.quitDriver();
		
	}
	
	@And("user clicks on menu button")
	public void user_clicks_on_menu_button() {
		
		login.validateIfNavigatesToHomePage();
	    
	}

	@When("user clicks on logout option")
	public void user_clicks_on_logout_option() {
	  logout.clickLogout();
	}

	@Then("user should be logged out and redirected to login page")
	public void user_should_be_logged_out_and_redirected_to_login_page() {
	   
	}


	
	
}
