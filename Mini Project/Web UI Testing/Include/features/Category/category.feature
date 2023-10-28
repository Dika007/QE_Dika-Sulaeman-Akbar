@tag
Feature: category
  @tag1
  Scenario: Select Category and no results
  Given login first
  When select category
  And Click category
  Then displays a notification that the result is empty
 