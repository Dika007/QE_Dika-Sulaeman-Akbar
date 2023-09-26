
@tag
Feature: pilih produk


  @tag1
  Scenario: pilih produk dengan benar
  	Given open website sepulsa homepage
    When I check button lainnya
    When I check button tagihan
    When I check button pendidikan
    Then I verify all buttons work
    
  
 	Scenario: there is no transport button
 	Given open link website
 	When I check button keuangan
 	Then there is no transport button
 
