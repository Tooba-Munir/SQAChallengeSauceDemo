Feature: To test the logout functionality of Sauce Lab

  Background: User is logged in
    Given user is on login page
    When user enters valid standard_user and valid secret_sauce
    And user clicks on login button

  Scenario: To validate that logged in user is able to log out the account
    Given user is on homepage
    And user clicks on menu button
    When user clicks on logout option
    Then user should be logged out and redirected to login page
