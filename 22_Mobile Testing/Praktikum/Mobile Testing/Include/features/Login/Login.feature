@tag
Feature: Login
I want to log in
Background: 
Given I open the application
  @tag1

  Scenario:Login successful
		When I fill in my email and password correctly
		And I click button login
		Then I successfully logged in
  
  
  Scenario Outline: Login failed by entering the wrong email or password
    When I entered my <email> or <password> incorrectly
    And I click button login failed
    Then verify wrong email or password

    Examples: 
      | email  										| password 				|
      | dnaidnn@gmail.com 				|    siapaakuini 	| 
      | helloworld54627@gmail.com |     hello				|
      | siapkamu@gmail.com 				|     admin123		|
      
      
  Scenario Outline: login fails when email is empty or email format is not correct
    When I entered an empty or incorrectly formatted <email> and I entered a <password>
    And I click button login failed email
    Then verify email not valid
    
        Examples: 
      | email  							| 		password 		|
      | akuini							|    	admin123 		| 
      | 									 	|     admin123		|
