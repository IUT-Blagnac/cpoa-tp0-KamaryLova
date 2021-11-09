Feature: Ordering drinks

  Scenario: Creating an empty order
    Given Romeo who wants to create an Order
    When Juliet is declared as recipient
    Then the order does not contain any drinks


Scenario: Adding a drink to an order
    Given Tom who wants to create an Order
    When Jerry is declared as recipient
    And a "PepsaCola Zero" is added to the order
    Then the order contains 1 drink