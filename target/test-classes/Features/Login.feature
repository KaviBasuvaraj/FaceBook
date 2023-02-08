Feature: 
  Login functionality in FB

  Scenario: 
    Login functionality using valid username and invalid password

    Given fb login page
    And maximize the window
    When enter valid username and invalid password
    And click login button
    Then need to be in password incorrect page
