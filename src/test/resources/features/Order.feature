Feature: Trendyol Order Process

  Scenario: Add item to cart and complete checkout
    Given I am on the Trendyol website
    When I add an item to my cart
    And I proceed to checkout
    Then I should complete the checkout process successfully