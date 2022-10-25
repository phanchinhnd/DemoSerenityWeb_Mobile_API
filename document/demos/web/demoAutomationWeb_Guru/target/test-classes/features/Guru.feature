Feature: Guru

  @Login
  Scenario Outline: As user i want Login to Hompage
    Given Navigate successfull ly to Login Page
    Then Verify Guru All Rights Reserved in bottom
    When Input "<username>" to username
    And Input "<password>" to password
    And Click to Login
    Then Verify Logout is displayed in Homepage
    Examples:
      | username   | password |
      | mngr447670 | besynuq  |