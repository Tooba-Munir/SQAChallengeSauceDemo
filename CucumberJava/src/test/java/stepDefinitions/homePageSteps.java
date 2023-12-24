package stepDefinitions;

import org.openqa.selenium.WebDriver;
import Handler.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;


public class homePageSteps {

	private WebDriver driver;

	HomePage homePage;
	

	@Before
	public void setUp() {
	

	    driver= DriverManager.getDriver();
		homePage = new HomePage(driver);

	}

	@After
	public void teardown() {
		DriverManager.quitDriver();
	}


	@Given("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
		Thread.sleep(2000);
		homePage.userIsOnHomePage();

	}
	@And("user is viewing the product section")
	public void user_is_viewing_the_product_section() {
    homePage.productSection();
	}

	@Then("the user should see a list of products")
	public void the_user_should_see_a_list_of_products() {
		homePage.getProductList();

	}

	@And("user should be able to click on the product name")
	public void user_should_be_able_to_click_on_the_product_name() {
		homePage.clickProduct();
		

	}
	
	@When("user selects a product and clicks on Add to cart button")
	public void user_selects_a_product_and_clicks_on_add_to_cart_button() {
	  homePage.addToCart();
	}

	@Then("the cart badge counter should be updated")
	public void the_cart_badge_counter_should_be_updated() {
		homePage.cartCounter();

	}
	@When("user clicks on filter options")
	public void user_clicks_on_filter_options() {
		homePage.clickFilterDropdown();
	    
	}

	@And("selects a Z-A name filter from dropdown")
	public void selects_a_z_a_name_filter_from_dropdown() throws InterruptedException {
	   homePage.selectFilterDropdown();
	   Thread.sleep(2000);
	}

	@Then("product list should be sorted in descending order")
	public void product_list_should_be_sorted_in_descending_order() {
	  homePage.sortDesc();
	}


	@And("user has added a product to the cart")
	public void user_has_added_a_product_to_the_cart() {
	   homePage.addToCart();
	}

	@When("user clicks on Remove from cart button")
	public void user_clicks_on_remove_from_cart_button() {
	    homePage.removeFromCartBtn();
	}
	@Then("the cart should be updated")
	public void the_cart_should_be_updated() {
	    homePage.cartEmpty();
	}



	@And("Remove from cart button for the product should be changed into Add to cart")
	public void remove_from_cart_button_for_the_product_should_be_changed_into_add_to_cart() {
	    homePage.cartBtnUpdate();
	}
	


}

