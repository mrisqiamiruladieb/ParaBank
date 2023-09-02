Feature: Transfer Funds

  @TransferFundsTdd
  Scenario Outline: Transfer Funds
    Given User is on transfer funds page
    When User inputs the <amount>
    And Users choose from accounts
    And User selects the account to
    And User clicks the transfer submit button
    Then User gets verifies the <result> of the transfer

    Examples:
      | amount | result |
      |  1500  | Passed |
      |        | Failed |