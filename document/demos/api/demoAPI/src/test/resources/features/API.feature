Feature: Demo API
  @API
  Scenario: Get user
    Given I have an user
    When I call API to get user
    Then the API should return status 200