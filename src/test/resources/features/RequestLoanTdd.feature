Feature: Request Loan

  @RequestLoanTdd
  Scenario Outline: Request Loan
    Given User is on request loan page
    When User inputs in the <loan_amount> and <down_payment>
    And User selects the from account
    And User clicks the apply now submit button
    Then User gets verifies the <result> of the request loan

    Examples:
    | loan_amount | down_payment | result |
    |     1500    |      250     | Passed |
    |     1500    |              | Failed |
    |             |      250     | Failed |
    |             |              | Failed |