@All
Feature: Request Loan

  @PositiveRequestLoanBdd @RequestLoanBdd
  Scenario: Request Loan Successful
    Given User is on request loan page
    When User fills in the loan amount and down payment
    And User selects the from account
    And User clicks the apply now submit button
    Then User verifies the results of the request loan

  @NegativeRequestLoanBdd @RequestLoanBdd
  Scenario: Request Loan Failed
    Given User is on request loan page
    When User clicks the apply now submit button
    Then User gets a loan request error message