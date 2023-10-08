Feature: Cart
  I will see all cart and cart details,
  user cart, data range cart, limit, sort,
  add, update and delete


  Scenario: Get all carts
    Given I set endpoint Get all carts
    When I set http request Get all carts
    Then received a status code response of 200 Get all carts
    And verify get all cart data

  Scenario: Get a single cart
    Given I set endpoint Get a single cart
    When I set the http request get single cart
    Then received a status code 200 response Get a single cart
    And Verify details of carts 5

  Scenario: Limit results cart
    Given I set endpoint Limit results cart
    When I set http request get Limit results cart
    Then received a status code 200 response Limit results cart
    And Check if data is available or empty limit cart

  Scenario: Sort results cart
    Given I set endpoint Sort results cart
    When I set http request get Sort results cart
    Then received a status code 200 response sort results cart
    And Check if data is available or empty sort cart

  Scenario: Get carts in a date range
    Given I set endpoint carts in a date range
    When I set the http request get date range
    Then received response code 200 date range
    And Check if data is available or empty date range

  Scenario: Get user carts
    Given I set endpoint user carts
    When I set the http request get user carts
    Then received response code 200 user carts
    And Check if data is available or empty user carts

  Scenario: Add a new product in cart
    Given I set endpoint new product in cart
    When I set the http request post user cart
    Then received response code 201 user cart
    And verify post cart data

  Scenario: Update a product put in cart
    Given I set endpoint put in cart
    When I set the http request put cart
    Then received response code 200 put cart
    And verify put cart data

  Scenario: Update a product patch in cart
    Given I set endpoint patch in cart
    When I set the http request patch cart
    Then received response code 200 patch cart
    And verify patch cart data

  Scenario: Delete a cart
    Given I set endpoint delete cart
    When I set the http request delete cart
    Then received response code 204 delete cart
