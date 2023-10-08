Feature: Products
  I will see all products and product details,
  all categories and category details, limit, sort,
  add, update and delete


  Scenario: Get all products
    Given I set the endpoint all products
    When I set http request get all
    Then received a status code response of 200 get all
    And response should contain a list of products

  Scenario: Get a single product
    Given I set the endpoint products 1
    When I set the http request get
    Then received a status code 200 response
    And Verify details of product 1

  Scenario: Limit results product
    Given I set endpoint Limit results product
    When I set http request get Limit results product
    Then received a status code 200 response Limit results product
    And Check if data is available or empty limit product

  Scenario: Sort results product
    Given I set endpoint Sort results product
    When I set http request get Sort results product
    Then received a status code 200 response sort results product
    And Check if data is available or empty sort product

  Scenario: Get all categories
    Given I set the endpoint categories
    When I set the http request get categories
    Then received a status code response of 200 categories
    And Verify categories data

  Scenario: Get products in a specific category
    Given I set endpoint detail category
    When I set the http request get detail category
    Then received a status code 200 response detail category
    And Verify details of category

  Scenario: Add new product
    Given I set endpoint Add new product
    When I set http request post
    Then received response code 201
    And verify adding new data

  Scenario: Update a product put
    Given I set endpoint Update a product
    When I set the http request put
    Then received response code 200 Update a product
    And verify update data put

  Scenario: Update a product patch
    Given I set endpoint Update a product patch
    When I set the http request patch
    Then received response code 200 Update a product patch
    And verify update data patch

  Scenario: Delete a product
    Given I set endpoint delete
    When I set the http request delete
    Then received response code 204 delete





