package pages;

import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {

	private WebDriver driver;
	private static Logger logger = LogManager.getLogger(LogOutPage.class);
	By logout_option = By.id("logout_sidebar_link");
	By loginForm = By.className("login_wrapper-inner");
	String loginPage_expected_Url= "https://www.saucedemo.com/";
	String loginPage_current_Url;

	public LogOutPage(WebDriver driver) {
	
		
		this.driver= driver;	
	}
	
	
	public void clickLogout() {
		driver.findElement(logout_option).click();
		
	}
	public void LoginPage() {
		
		loginPage_current_Url= driver.getCurrentUrl();
		assertEquals("User is not logged out with success, case failed",loginPage_expected_Url,loginPage_current_Url);
		logger.info("User logged out with success!");
	    driver.findElement(loginForm).isDisplayed();
	}
	}
