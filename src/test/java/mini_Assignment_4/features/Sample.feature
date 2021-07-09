Feature: Login to application
#
#  Scenario: Customer Dashboard Login
#    Given User is on Login page
#    When User is on to the application
#    Then Customer Dashboard is Displayed
#    And Make payment option is visible

  Scenario: Customer Dashboard Login
    Given Launch browser
    When Login with correct credential
    Then find product and add to cart
    And continue shopping
    And Add one more product in cart and verify cart total product
    And count cart value and go to check out
    And provide customer details
    And verify order success message