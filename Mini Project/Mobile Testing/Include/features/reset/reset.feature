@tag
Feature: Reset

  @tag1
  Scenario: reset name and quantity textfields
    Given open application
    When click button add and set name,quantity
    And Click button reset
    Then reset was successful
