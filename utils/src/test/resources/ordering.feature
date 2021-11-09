Feature: Ordering drinks

  Scenario: Creating an empty order
    Given Romeo who wants to create an Order
    When Juliet is declared as recipient
    Then the order does not contain any drinks