@All
Feature: Accounts Overview

  @AccountDetailsBdd @AccountsOverviewBdd
  Scenario: Account Details
    Given User is on accounts overview page
    When Users click on the account number to find out the details
    Then User gets account details of that number

  @AccountActivityDetailsBdd @AccountsOverviewBdd
  Scenario: Account Activity Details
    Given User is on accounts overview page
    When Users click on the account number to find out the details
    And User clicks on transaction
    Then User gets transaction details

  @AccountActivityDetailsNotFoundBdd @AccountsOverviewBdd
  Scenario: Account Activity Details Not Found
    Given User is on accounts overview page
    When Users click on the account number to find out the details
    And User clicks on the activity period filter
    And User selects the invalid activity period
    And User clicks the go submit button
    Then User gets not found message