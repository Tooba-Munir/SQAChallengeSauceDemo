Feature: To test that user can view the products, add products to the cart and applies filters.

  Background: User is logged in
    Given user is on login page
    When user enters valid standard_user and valid secret_sauce
    And user clicks on login button

  Scenario: To validate that user is able to view the products under the Products section.
    Given user is on homepage
    And user is viewing the product section
    Then the user should see a list of products
    And user should be able to click on the product name

  Scenario: To validate that user is able to add the products to the cart with success
    Given user is on homepage
    And user is viewing the product section
    When user selects a product and clicks on Add to cart button
    Then the cart badge counter should be updated

  Scenario: To validate that user is able to remove the products from the cart with success
    Given user is on homepage
    And user is viewing the product section
    And user has added a product to the cart
    When user clicks on Remove from cart button
    Then the cart should be updated
    And Remove from cart button for the product should be changed into Add to cart

  Scenario: To validate that user is able to apply Z-A product names filter on product list
    Given user is on homepage
    And user is viewing the product section
    When user clicks on filter options
    And selects a Z-A name filter from dropdown
    Then product list should be sorted in descending order
