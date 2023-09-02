@All
Feature: Transfer Funds

  @TransferFundsBdd
  Scenario: Transfer Funds Successful
    Given User is on transfer funds page
    When User enters the amount
    And Users choose from accounts
    And User selects the account to
    And User clicks the transfer submit button
    Then User verifies the result of the transfer