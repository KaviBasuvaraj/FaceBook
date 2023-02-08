Feature: 
  Login functionality in FB
  
  
  
        

  Scenario: 
    Login functionality using valid username and invalid password
    Given open fb login page
    And maximize the window
    When enter valid username and invalid password
    And click login button
    Then need to be in password incorrect page
    
    Scenario: 
     Create new Account 
    Given open fb login page
    And maximize the window
    When create new account button
    And enter details
    Then signup
