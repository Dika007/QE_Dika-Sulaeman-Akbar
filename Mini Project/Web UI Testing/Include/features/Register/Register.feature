@tag
Feature: register

Background:
Given Set endpoint register
  @tag1
  Scenario: registration successful
  When set the correct
  And click button register
  Then registration success
  
  Scenario Outline: registration without full name, email, password and  email you already use
    When set<fullname>and<email>and<password>
    And click button register1
    Then failed to register
    Examples: 
      | fullname  		| email 										 | password 	 |
      |  					 		|     siapaaku@gmail.com		 | a123				 |
      | heeloo world 	|     											 | 123kaka		 |
      | allo	  			|     kakaku@gmail.com 			 | 						 |
      | Dika sa	 	 		|     akuinisiapa@gmail.com  | admin123		 |
