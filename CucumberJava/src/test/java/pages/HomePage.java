package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class HomePage {

	private WebDriver driver;
	private static Logger logger = LogManager.getLogger(HomePage.class);
	String homePageUrl = "https://www.saucedemo.com/inventory.html";
	String ProductCurrentTitle;
	String name;
	boolean cartUsed= false;
	String ProductExpectedTitle= "Products";
	String sortedExpectedProduct;
	int item_size_expected=6;
	WebElement sortedCurrentProduct;
	By product_title= By.className("title");
	By product_list= By.className("inventory_list");
	By product_name = By.className("inventory_item_name");
	By product_selection= By.id("add-to-cart-sauce-labs-backpack");
	By cart_badge = By.className("shopping_cart_badge");
	By filter_dropdown = By.className("product_sort_container");
	By remove_from_cart_btn = By.id("remove-sauce-labs-backpack");
	String cart_badge_counter;
	int currentCounter;
	int counter = 0;
	List <WebElement> items;
	WebElement firstItem;
	WebElement dropdown;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void userIsOnHomePage() {
		String currentUrl= driver.getCurrentUrl();
		if(currentUrl.equals(homePageUrl)) {
		assertEquals(homePageUrl,currentUrl);
		logger.info("User has successfully landed on homepage");
		}
		else {
			
			fail("User was not redirected to homepage Case failed");
			
		}
		
	}
	public void productSection() {
		ProductCurrentTitle= driver.findElement(product_title).getText();
		if(ProductCurrentTitle.equals(ProductExpectedTitle)) {
		assertEquals("User is not viewing the Product Section, case failed",ProductExpectedTitle,ProductCurrentTitle);
		logger.info("User is viewing the Products section!");
		}
		else {
			fail("User is not viewing the Product section, case failed");
		}
	}
	public void getProductList()   {
	driver.findElement(product_list).isDisplayed();
	items = driver.findElements(product_name);
	assertNotNull("Product List should not be null", items.size());
	assertEquals("Displayed product items are not same as expected, case failed!",item_size_expected,items.size());
	
		
		
	}
	public void clickProduct() {
		
		if(items!=null) {
			firstItem = items.get(0);
			firstItem.click();
			
		}
		else {
			fail("The list is empty");
		}
				
	}
	public void addToCart() {
		
		driver.findElement(product_selection).click();
		counter +=1;
		cartUsed= true;
		
		
		
	}
	public void cartCounter() {
		cart_badge_counter = driver.findElement(cart_badge).getText();
		currentCounter=Integer.parseInt(cart_badge_counter);
		assertEquals("The item is not added into the cart with success, case failed",counter,currentCounter);
		
	}
	
	public void clickFilterDropdown() {
		dropdown = driver.findElement(filter_dropdown);
		dropdown.click();
		
		
		
	}
	
	public void selectFilterDropdown() {
		dropdown.findElement(By.xpath("//option[ .='Name (Z to A)']")).click();
	}
	
	public void sortDesc()
	{
		items = driver.findElements(product_name);
		
		List<String> itemText = new ArrayList<>();
		for (WebElement item:items) {
			itemText.add(item.getText());
		}
		Collections.sort(itemText,Collections.reverseOrder());
		sortedExpectedProduct = itemText.get(0);
		
		List <WebElement> updatedItem = driver.findElements(product_name);
		sortedCurrentProduct=updatedItem.get(0);
		
		assertEquals("Items are not sorted in descending order,case failed",sortedExpectedProduct,sortedCurrentProduct.getText());
	}	
	
	
	public void removeFromCartBtn() {
		driver.findElement(remove_from_cart_btn).click();
		counter-=1;
		
		
	}
	public void cartEmpty() {
		if (cartUsed==true&&counter==0) {
			logger.info("The cart is updated, item removed with success!");
			
		}
		else {
			fail("Cart is not updated, case failed!");
		}
	}
	public void cartBtnUpdate() {
		if (cartUsed==true&&counter==0) {
			driver.findElement(product_selection)
.isDisplayed();
			logger.info("Remove from cart button has been changed into add to cart for the product!");
			
		}
		else {
			fail("Cart is not updated, case failed!");
		}
	}
}
