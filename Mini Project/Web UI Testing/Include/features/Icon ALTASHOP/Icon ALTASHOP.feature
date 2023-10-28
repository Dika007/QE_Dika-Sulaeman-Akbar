@tag
Feature: Icon ALTASHOP

  @tag1
  Scenario: ALTASHOP icon on the register page
  Given Navigate to the register page
  When click icon ALTASHOP
  Then Successfully moved to the ALTASHOP home page
  
  Scenario: ALTASHOP icon on the login page
  Given Navigate to the login page
  When click icon ALTASHOP1
  Then Successfully moved to the ALTASHOP home page1
  
  
  Scenario: ALTASHOP icon on the cart page
  Given Navigate to the cart page
  When click icon ALTASHOP2
  Then Successfully moved to the ALTASHOP home page2
  
  
  Scenario: ALTASHOP icon on the transactions page
  Given login first5
  When click icon ALTASHOP3
  Then Successfully moved to the ALTASHOP home page4