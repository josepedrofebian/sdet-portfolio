Feature: Shopping Cart

  Scenario: Add product to shopping cart

    Given user is on the store page
    When user adds "Laptop Pro" to the cart
    And user opens the shopping cart
    Then "Laptop Pro" should be displayed in the cart