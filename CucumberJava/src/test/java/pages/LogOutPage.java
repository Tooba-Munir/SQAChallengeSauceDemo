package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {

	private WebDriver driver;
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
	    driver.findElement(loginForm).isDisplayed();
	}
	}
