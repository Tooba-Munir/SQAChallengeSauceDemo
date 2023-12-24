package pages;

import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
private WebDriver driver;
private static Logger logger = LogManager.getLogger(CheckoutPage.class);

public CheckoutPage(WebDriver driver) {
	this.driver=driver;
}

By cart_icon = By.className("shopping_cart_link");
String cart_page_expected_title = "Your Cart";
String checkout_page_expected_title= "Checkout: Your Information";
By cart_page_current_title=By.xpath("//span[text()='Your Cart']");
By checkout_page_current_title=By.xpath("//span[text()='Checkout: Your Information']");
By cart_item=By.className("cart_item");
By item_info= By.className("inventory_item_name");
By item_label = By.id("item_4_title_link");
By item_name= By.className("inventory_item_name");
By checkout_btn= By.id("checkout");
By firstname_field = By.id("first-name");
By lastname_field = By.id("last-name");
By zipCode_field = By.id("postal-code");
By continue_btn = By.id("continue");
By checkoutSummary = By.className("summary_info");
By checkoutFinish_btn = By.id("finish");
By thankyou_note = By.id("checkout_complete_container");
String checkout_finish_expected_title="Checkout: Complete!";
By checkout_finish_current_title= By.xpath("//span[text()='Checkout: Complete!']");
String items;





public void clickCart() {
	items = driver.findElement(item_label).findElement(item_name).getText();
	driver.findElement(cart_icon).click();
	String text= driver.findElement(cart_page_current_title).getText();
	assertEquals("User is not redirected to Your Cart page with success, case failed!",cart_page_expected_title,text);
	logger.info("User is redirected to Your Cart page with success!");
}
 public void cartItemInfo() {
 String cartInfo = driver.findElement(item_info).getText();
 assertEquals("The item info is incorrect, case failed",items,cartInfo);
 logger.info("Cart has the correct item!");
 }
 
 public void clickCheckout() {
	 driver.findElement(checkout_btn).click();
	 String checkout_title = driver.findElement(checkout_page_current_title).getText();	 
	 assertEquals("User is not redirected to Checkout Information page, case failed",checkout_page_expected_title,checkout_title);
	 logger.info("User is redirected to Checkout Information page with success!");
 }
 public void CompleteCheckout() {
	 driver.findElement(firstname_field).sendKeys("Andy");
	 driver.findElement(lastname_field).sendKeys("THOMAS");
	 driver.findElement(zipCode_field).sendKeys("7654322");
	 driver.findElement(continue_btn).click();
	 driver.findElement(checkoutSummary).isDisplayed();
	 driver.findElement(checkoutFinish_btn).click();
	 
 }
 public void CheckoutSuccess() {
	 driver.findElement(thankyou_note).isDisplayed();
	 String checkout_done=driver.findElement(checkout_finish_current_title).getText();
	 assertEquals("Checkout is not completed with success, case failed",checkout_finish_expected_title,checkout_done);
	 logger.info("Checkout is completed with success!");
	 
 }

}
