Feature: Loginlinkedin

  As a user
  I want to see the home page

  Background:  Given I am on the main page
  Scenario: As a user I have to be able to successfully log in with a Google account
    When I log in using the correct Google account
    Then I am on the home page

  Scenario: As a user I have to be to failed login
    When I input invalid my username and password
    And I click login button
    Then I get a notification that the email or password is wrong