Feature: Remove

  @tag1
  Scenario: remove successful
    Given Open application
    When delete items
    Then item deleted successfully

 