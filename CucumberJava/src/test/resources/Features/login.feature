Feature: To test the login functionality of Sauce Demo account

  Scenario Outline: To test that user is able to login with valid credentials
    Given user is on login page
    When user enters valid <username> and valid <password>
    And user clicks on login button
    Then user is navigated to homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: To test that blocked user is unable to login the account
    Given user is on login page
    When user enters blocked <username> and <password>
    And user clicks on login button
    Then user sees error message and is not logged in

    Examples: 
      | username        | password     |
      | locked_out_user | secret_sauce |
