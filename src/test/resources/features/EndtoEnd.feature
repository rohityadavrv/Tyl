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


#    Other scenarios :
#
#    1. To verify standard user with incorrect credentials is not allowed to login.
#    2. To verify the login behavior all the different types of user locked_out_user,problem_user,performance_glitch_user.
#    3. To verify the all the 4 types of sorting is working correctly.
#    4. To verify user is able to add and remove the items from cart.
#    5. To verify user is able to purchase and edit any available quantity of the items.
#    6. To verify user is able to remove the items from cart.
#    7. To verify Continue to Shopping takes user back to product page.
#    8. To verify only correct Postcode details can be allowed to user.
    
