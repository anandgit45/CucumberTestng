Feature: To verify facebook login functionality

  Scenario Outline: verify login details with invalid credentials
    Given User is on facebook login page
    When User enter the "<username>" and "<password>" and Login
    Then user validate the result

    Examples: 
      | username | password  |
      | hello    |    333666 |
      | java     | selenium  |
      
