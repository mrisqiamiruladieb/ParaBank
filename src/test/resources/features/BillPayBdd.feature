@All
Feature: Bill Pay

  @PositiveBillPayBdd @BillPayBdd
  Scenario: Send Payment Successful
    Given User is on bill pay page
    When User fills in the payee information
    And User selects the account to pay
    And User clicks the send payment submit button
    Then User gets verifies send payment results

  @NegativeBillPayBdd @BillPayBdd
  Scenario: Send Payment Failed
    Given User is on bill pay page
    When User is not fulfilled the payee information
    And User clicks the send payment submit button
    Then Users get the required payee data error message