@tag
Feature: Registrasi
I want to register
Background:    
Given I open the application1
  @tag1
  Scenario: registration successful
    When I click Create one
    And I set the name email password and confirmed the password correctly
    And  I clicked the register button
    Then verify registered successfully
    
  Scenario Outline: Register with an invalid or empty email
    When I click Create one1 
    And I set the <name>, the <email> as invalid or empty, <password> and <passwordconfirmation> 
    And  I clicked the register button1
    Then verify registered not valid email
    Examples: 
      | name  										| 			email 			|password			|passwordconfirmation	|
      | dika											|    dikagmail.com	| admin123		|	admin123						|
      | dika											|    								|	admin123		|	admin123						|

      
