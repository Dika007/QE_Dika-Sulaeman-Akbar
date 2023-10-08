Feature: User
  I will see all user and user details or single,
  limit, sort, add, update and delete

  Scenario: Get all users
    Given I set endpoint all users
    When I set the http request get all users
    Then received response code 200 all users
    And Check if data is available or empty user

  Scenario: Get a single user
    Given I set endpoint single users
    When I set the http request get single users
    Given received response code 200 single user
    And verify user data details

  Scenario: Limit results Users
    Given I set endpoint Limit results Users
    When I set http request get Limit results users
    Then received a status code 200 response Limit results users
    And Check if data is available or empty limit users

  Scenario: Sort results users
    Given I set endpoint Sort results users
    When I set http request get Sort results user
    Then received a status code 200 response sort results user
    And Check if data is available or empty sort users

  Scenario: Add a new user
    Given I set endpoint new data users
    When I set the http request post new users
    Then received response code 201 data new users
    And verify post data users

  Scenario: Update a users put
    Given I set enpoint put users
    When I set the http request put users
    Then received response code 200 put users
    And verify put data users

  Scenario: Update a users patch
    Given I set endpoint patch users
    When I set the http request patch users
    Then received response code 200 patch users
    And Check if data is available or empty patch users

  Scenario: Delete a user
    Given I set endpoint delete users
    When I set the http request delete users
    Then received response code 204 delete users



