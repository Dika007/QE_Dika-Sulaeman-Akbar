@tag
Feature: view transactions

Background:
Given set login first2
  @tag1
  Scenario: View transactions after payment
  When click buy button and icon cart
  And click button pay
  Then succes view transactions
  
  Scenario: View transactions on profile
  When click icon profile and click transactions
  Then succes view transactions1
  
  
