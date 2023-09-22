Feature: ButtonIconLinkedin
  As a user
  I want to see article page, person page, learning page, and work page

Background: Given I am on the main page

  Scenario: As a user i have to able to navigate to article page
    When I click icon button article
    Then I am to navigate article page

  Scenario: As a user i have to able to navigate to person page
    When I click icon button person
    Then I am to navigate person page

  Scenario: As a user i have to able to navigate to learning page
    When I click icon button learning
    Then I am to navigate learning page

  Scenario: As a user i have to able to navigate to work page
    When I click icon button work
    Then I am to navigate work page


