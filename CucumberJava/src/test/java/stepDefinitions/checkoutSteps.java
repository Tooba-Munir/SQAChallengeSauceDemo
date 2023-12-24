package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Handler.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class checkoutSteps {

	private WebDriver driver;
	CheckoutPage checkout;
	
	
	@Before
	public void setUp() {
		driver = DriverManager.getDriver();
		checkout = new CheckoutPage(driver);
		
		
	}
	
	@Given("user clicks on cart icon after adding the product to cart")
	public void user_clicks_on_cart_icon_after_adding_the_product_to_cart() {
	   checkout.clickCart();
	}

	@And("user can see the product details added in cart")
	public void user_can_see_the_product_details_added_in_cart() {
		checkout.cartItemInfo();
	  
	}

	@When("user clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		checkout.clickCheckout();
	  
	}
	@Then("user should be able to complete checkout informarion")
	public void user_should_be_able_to_complete_checkout_informarion() {
        checkout.CompleteCheckout();
	}

	@And("user should sees a success prompt after successful checkout")
	public void user_should_sees_a_success_prompt_after_successful_checkout() {
	checkout.CheckoutSuccess();
	}
	
	
	
}
