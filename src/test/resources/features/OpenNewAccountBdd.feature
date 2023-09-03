@All
Feature: Open New Account

  @OpenNewAccountBdd
  Scenario: Open New Account Successful
    Given User is on open new account page
    When User selects the account type
    And User selects the old account to transfer funds
    And User clicks the open new account submit button
    Then User gets verifies open new account result