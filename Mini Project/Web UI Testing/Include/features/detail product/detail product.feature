@tag
Feature: detail product

  @tag1
  Scenario: View product details by logging in
  Given login first2
  When click button detail
  Then succes detail product
  
  Scenario: View product details without logging in
  Given navigate to page home ALTASHOP
  When click button detail1
  Then succes detail product1