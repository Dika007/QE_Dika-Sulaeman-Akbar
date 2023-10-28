@tag
Feature: logout

Background:
Given login first3
  @tag1
  Scenario: log out in the profile menu
	When click icon profile and click logout
	Then logged out successfully
	
