Feature: Not successful login

  Scenario: login with not valid credentials
    Given I fill in "login" with "izuuu"
    And I fill in "password" with "izuuu"
    When I press "Login"
    Then I should not be on the users home page
    Examples:
      | login   | password |
      | "izuuu" | "izuuu"  |