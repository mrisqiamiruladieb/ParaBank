Feature: Bill Pay

  @BillPayTdd
  Scenario Outline: Send Payment
    Given User is on bill pay page
    When User fills in the payee information and <amount>
    And User selects the account to pay
    And User clicks the send payment submit button
    Then User verifies send payment <result>

    Examples:
    | amount | result |
    |   50   | Passed |
    |        | Failed |