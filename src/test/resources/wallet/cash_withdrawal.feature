Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Not successful withdrawal from a wallet in credit
    Given I have deposited $199 in my wallet
    When I request $201
    Then $201 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $500 in my wallet
    When I request $500
    Then $500 should be dispensed