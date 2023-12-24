Feature: To test the checkout functionality of Sauce lab website.

  Background: User is logged in and has selected a product
    Given user is on login page
    When user enters valid standard_user and valid secret_sauce
    And user clicks on login button
    Given user is on homepage
    And user is viewing the product section
    Then the user should see a list of products
    When user selects a product and clicks on Add to cart button 
    Then the cart badge counter should be updated
    
    Scenario: To validate that user is able to complete checkout after adding the product to the cart.
    Given user clicks on cart icon after adding the product to cart
    And user can see the product details added in cart
    When user clicks on Checkout button 
    Then user should be able to complete checkout informarion
    And user should sees a success prompt after successful checkout
    