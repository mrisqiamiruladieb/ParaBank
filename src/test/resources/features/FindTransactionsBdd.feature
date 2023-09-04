@All
Feature: Find Transactions

  @PositiveByTransactionIdBdd @FindTransactionsBdd
  Scenario: By Transaction Id Successful
    Given User has transaction id
    When User is on find transactions page
    And User selects an account
    And User fills in the transaction id
    And User clicks the find by transaction id submit button
    Then Users verify finding transaction results

  @NegativeByTransactionIdBdd @FindTransactionsBdd
  Scenario: By Transaction Id Failed
    Given User has transaction id
    When User is on find transactions page
    And User selects an account
    And User entered an invalid transaction id
    And User clicks the find by transaction id submit button
    Then Users gets find transactions error message

  @PositiveByDateBdd @FindTransactionsBdd
  Scenario: By Date Successful
    Given User has transaction date
    When User is on find transactions page
    And User selects an account
    And User fills in the transaction date
    And User clicks the find by transaction date submit button
    Then Users verify finding transaction results

  @NegativeByDateBdd @FindTransactionsBdd
  Scenario: By Date Failed
    Given User has transaction date
    When User is on find transactions page
    And User selects an account
    And User entered an invalid transaction date
    And User clicks the find by transaction date submit button
    Then Users gets find transactions error message

  @PositiveByDateRangeBdd @FindTransactionsBdd
  Scenario: By Date Range Successful
    Given User has transaction date range
    When User is on find transactions page
    And User selects an account
    And User fills in the transaction date range
    And User clicks the find by transaction date range submit button
    Then Users verify finding transaction results

  @NegativeByDateRangeBdd @FindTransactionsBdd
  Scenario: By Date Range Failed
    Given User has transaction date range
    When User is on find transactions page
    And User selects an account
    And User entered an invalid transaction date range
    And User clicks the find by transaction date range submit button
    Then Users gets find transactions error message

  @PositiveByAmountBdd @FindTransactionsBdd
  Scenario: By Amount Successful
    Given Users have transaction amount data
    When User is on find transactions page
    And User selects an account
    And User fills in the transaction amount data
    And User clicks the find by transaction amount data submit button
    Then Users verify finding transaction results

  @NegativeByAmountBdd @FindTransactionsBdd
  Scenario: By Amount Failed
    Given Users have transaction amount data
    When User is on find transactions page
    And User selects an account
    And User entered an invalid transaction amount data
    And User clicks the find by transaction amount data submit button
    Then Users gets find transactions error message