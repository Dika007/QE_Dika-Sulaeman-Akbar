@tag
Feature: Add items

Background:
Given open apllication
  
  @tag1
  Scenario: successfully added item
  When Click add icon and set name1, quantity1
  And click button add items
  Then Succes add items
  
  
  
  Scenario Outline: add items failed name
    When click add icon1 and set<name>,<quantity>
  	And click button add items1
  	Then failed add itmes

    Examples: 
      | name 																											| quantity | 
      | 																												  |     		 | 
      |  																													|     1 	 |     
      |  																		a											|     1 	 |
      
      
  Scenario Outline: add items failed password
    When click add icon2 and set<name2>,<quantity2>
  	And click button add items2
  	Then failed add itmes2

    Examples: 
      | name2 																										| quantity2| 
      | 																												  |     		 | 
      |  		Aku																										|      		 | 
      |  		Aku																										|    0  	 | 
      |  		aku																										|    -1  	 |    
      
   	Scenario: Add items with more than 50 characters in the name textfield
    When click add icon3 and set name3,quantity3
  	And click button add items3
  	Then success cannot be more than 50     
 
   Scenario: managed to choose one in the list box
  When Click add icon and set name1, quantity1 and list box
  And click button add items4
  Then Succes add items4
       