package pages;

import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class LoginPage {
	
	private WebDriver driver;
	private static Logger logger = LogManager.getLogger(LoginPage.class);
    String URL = "https://www.saucedemo.com/";
	By username_field = By.id("user-name");
	By password_field = By.id("password");
	By login_btn = By.id("login-button");
	By burger_menu_btn = By.id("react-burger-menu-btn");
	By logout_btn = By.id("logout_sidebar_link");
	By error_btn = By.className("error-button");
	String error_expected_message="Epic sadface: Sorry, this user has been locked out.";
	By error_current_message = By.xpath("//div[@class='error-message-container error']/h3");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void enterUsernameAndPassword(String username, String password) {
		driver.findElement(username_field).sendKeys(username);
		driver.findElement(password_field).sendKeys(password);
		
	}
	public void clickLoginBtn() {
		driver.findElement(login_btn).click();
             
	}
	public void validateIfNavigatesToHomePage() {
		driver.findElement(burger_menu_btn).click();
		driver.findElement(logout_btn).isDisplayed();
		logger.info("User successfully logged in!");
	}
	
	public void errorMessage() {
		driver.findElement(error_btn).isDisplayed();
		String message = driver.findElement(error_current_message).getText();
		assertEquals("No validation error was shown, case failed",error_expected_message,message);
	}
	public void loginPage() {
		driver.get(URL);
	}
}
