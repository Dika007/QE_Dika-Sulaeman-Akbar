@tag
Feature: login sepulsa

Background:
Given open website sepulsa
  @tag1
  Scenario Outline: login sepulsa invalid
  When I input <email> in field email
  And I input <password1> in field password1
  And I click button masuk
  Then I can see the error warning above

    Examples: 
      | email  | password1 | 
      | akusiapa1111@gmail.com 	|     okeoke 		|
      | siapaitu456@gmail.com	|     apatuhh 		|
      
  Scenario: login sepulsa valid
  When I input email valid
  And I input password1 valid
  And I click button masuk
  Then I can see the home page
  