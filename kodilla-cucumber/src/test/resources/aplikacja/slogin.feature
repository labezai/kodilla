Feature: Successful login

  Scenario: login with valid credentials
    Given I fill in "login" with "iza"
    And I fill in "password" with "iza"
    When I press "Login"
    Then I should be on the users home page
    Examples:
      | login | password |
      | "iza" | "iza"    |
