Feature: To verify all different flows of a standard user

  Background:
    Given user is on the Login Page

  @StandardUser @positive
  Scenario Outline: Verify a standard customer is able to purchase the cheapest and costliest product
    When user enters "<UserName>" in "Username"
    And user enters "<Password>" in "Password"
    And user press the "Login" button
    Then user should land on "PRODUCTS" page
    When user selects "<filter>" from dropdown
    And user clicks on add to cart  of "First" item
    And user clicks on add to cart  of "Last" item
    And user press the "Cart" button
    Then user should land on "YOUR CART" page
    And user should see "<No of items>" items in the cart
    And user press the "Checkout" button
    Then user should land on "CHECKOUT: YOUR INFORMATION" page
    And user enters "<FirstName>" in "FirstnameField"
    And user enters "<LastName>" in "LastNameField"
    And user enters "<Zipcode>" in "ZipcodeField"
    Then user should land on "CHECKOUT: YOUR INFORMATION" page
    And user press the "Continue" button
    And user press the "Finish" button
    Then user should land on "CHECKOUT: COMPLETE!" page

    Examples:

      | UserName      | Password     | filter | FirstName | LastName | Zipcode | No of items |
      | standard_user | secret_sauce | hilo   | Rohit     | Yadav    | HX1 1QA | 2           |
