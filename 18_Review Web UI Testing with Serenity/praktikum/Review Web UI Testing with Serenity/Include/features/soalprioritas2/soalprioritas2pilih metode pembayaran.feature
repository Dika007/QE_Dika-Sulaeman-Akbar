
@tag
Feature: pilih metode pembayaran

Background:
   Given open link website sepulsa
  @tag1
  Scenario: metode pembayaran benar
 
    When I input no telepon
    When I chose the data package
    When I input email 
    When I choose the payment method
    When I click button bayar
    Then proses succes
  
  Scenario: metode pembayaran salah
   When I input no telepon1
    When I chose the data package1
    When I input email1 
    When I click button bayar
  Then error metode pembayaran

  