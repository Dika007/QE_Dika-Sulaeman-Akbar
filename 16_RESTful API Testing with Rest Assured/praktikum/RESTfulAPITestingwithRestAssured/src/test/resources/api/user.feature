Feature: User
  I want to see the list of users,
  create new data, change data,
  delete data, from all data or one data

#    positive semua data
  Scenario: POST - I have be able to to create new user
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

#    negative

  Scenario: POST - I have be able to to create new user
    Given I set POST endpoints incorrectly
    When I send POST HTTP request1
    Then I receive valid HTTP response1 code 201
    And I receive valid data for new user1

#    positive semua data
  Scenario: Get - I can get the user
  Given I set the GET endpoint correctly
  When I sent the HTTP GET request correctly
  Then I received a valid HTTP response code 200 correctly
  And I received valid data for the user

#    negative
  Scenario: Get - I can get the user
    Given I set the GET endpoint1 correctly
    When I sent the HTTP GET request1 correctly
    Then I received valid HTTP response code 200
    And I received empty valid data



#1 data
#  positive
  Scenario: Get - I have be able to get detail user
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

#    negative
  Scenario: Get - can get user details
    Given I set the GET endpoint incorrectly
    When I sent an HTTP GET request
    Then I received a valid HTTP response code 200
    And I did not receive valid data for user details


#    positive
  Scenario: PUT - I have be able to to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response12 code 200
    And I receive valid data for existing user

#    negative
  Scenario: PUT - I have be able to to update existing user
    Given I set PUT endpoints incorrectly
    When I send PUT HTTP request1
    Then I receive valid HTTP response100 code 200
    And I receive valid data for existing user5

  Scenario: DELETE- I have be able to to delete existing user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I valid HTTP response code 200
#
#    negative
  Scenario: DELETE- I have be able to to delete existing user
    Given I set DELETE endpoints incorrectly
    When I send DELETE HTTP request1
    Then I receive valid HTTP response1 code 204