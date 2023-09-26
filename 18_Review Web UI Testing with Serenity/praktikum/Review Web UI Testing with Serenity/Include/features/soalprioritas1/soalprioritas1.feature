@tag
Feature: Login

Background:
Given open website
  @tag1
  Scenario Outline: login with invalid username and invalid password
    When I input <username> in field username
    And I input <password> in field password
    And I click button login
    Then I able to see alert error

    Examples: 
      | username  	| password |
      | akuganteng 	| secret_sauce |
      | siapa 			| akusiapa		 |
      | kamu	 			| kamudanaku	 |
      | lahkogitu 	| 						 |
      
      
   Scenario: login with valid username and password
    When I input valid username
    And I input valid password
    And I click button login
    Then I able to see homepage
    
   