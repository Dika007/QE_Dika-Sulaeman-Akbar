@tag
Feature: cart

Background:
Given set login first
  @tag1
  Scenario: add products to cart
  When add product
  And click icon cart2  and click button plus
  Then succes 
  
  Scenario: reduce products to cart
  When add products1
  And click icon cart3  and click button min
  Then succes reduce
  
  Scenario: reduce products to cart to 0
  When add products2
  And click icon cart4  and click button min to nol
  Then displays an empty product notification

