@tag
Feature: add Product


Background:
Given login first1
  @tag1
  Scenario: add 1 product
	When click button buy
	And click icon cart
	Then succes add 1 product
	
	Scenario: add more than 1 product
	When double click button buy 
	And click icon cart1
	Then succes add more than 1 product
