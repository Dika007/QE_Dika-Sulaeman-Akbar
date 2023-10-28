@tag
Feature: payment

Background:
Given set login first1
  @tag1
  Scenario: payment successful
  When click buy button and click button cart
  And click pay button
  Then succes pay
  
  Scenario:pay with no product
  When click button cart
  Then displays an empty product notification1
  
  
