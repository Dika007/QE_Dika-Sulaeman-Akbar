
@tag
Feature: Login

Background: 
Given set endpoint Login
  @tag1
  Scenario: Login successful
	When set the correct login
	And click button login
	Then Login Success
  
  
  Scenario Outline: Login without email, password, unregistered email, wrong password
    When set <email> and <password>
    And click button login1
    Then Login failed

    Examples: 
      | email  													|			password 	|
      |  																|     admin123 	| 
      |  akuinisiapa@gmail.com 					|      					| 
      |  	haytayodiabiskecil@gmail.com	|     admin123 	| 
      |  	akuinisiapa@gmail.com					|     siapa123 	| 
  