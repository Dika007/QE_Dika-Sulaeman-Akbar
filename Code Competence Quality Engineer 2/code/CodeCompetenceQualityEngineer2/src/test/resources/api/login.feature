Feature: Login
  I want to login successfully


  Scenario: User login
    Given I set endpoint login
    When I set the http request post login
    Then received response code 200 post login
    And successful login