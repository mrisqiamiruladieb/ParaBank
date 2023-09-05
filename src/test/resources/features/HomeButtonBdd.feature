@All
Feature: Home Button

  @AtmServicesWithdrawFundsHomeButtonBdd @HomeButtonBdd
  Scenario: Atm Services Withdraw Funds
    Given User is on landing page
    When User clicks the withdraw funds button
    Then User verifies new url result

  @AtmServicesTransferFundsHomeButtonBdd @HomeButtonBdd
  Scenario: Atm Services Transfer Funds
    Given User is on landing page
    When User clicks the atm services transfer funds button
    Then User verifies new title result

  @AtmServicesCheckBalancesHomeButtonBdd @HomeButtonBdd
  Scenario: Atm Services Check Balances
    Given User is on landing page
    When User clicks the check balances button
    Then User verifies new url result

  @AtmServicesMakeDepositsHomeButtonBdd @HomeButtonBdd
  Scenario: Atm Services Make Deposits
    Given User is on landing page
    When User clicks the make deposits button
    Then User verifies new title result

  @OnlineServicesBillPayHomeButtonBdd @HomeButtonBdd
  Scenario: Online Services Bill Pay
    Given User is on landing page
    When User clicks the bill pay button
    Then User verifies new url result

  @OnlineServicesAccountHistoryHomeButtonBdd @HomeButtonBdd
  Scenario: Online Services Account History
    Given User is on landing page
    When User clicks the account history button
    Then User verifies new url result

  @OnlineServicesTransferFundsHomeButtonBdd @HomeButtonBdd
  Scenario: Online Services Transfer Funds
    Given User is on landing page
    When User clicks the online services transfer funds button
    Then User verifies new url result

  @ReadMore1HomeButtonBdd @HomeButtonBdd
  Scenario: Read More 1
    Given User is on landing page
    When User clicks the read more one button
    Then User verifies new title result

  @LatestNews1HomeButtonBdd @HomeButtonBdd
  Scenario: Latest News 1
    Given User is on landing page
    When User clicks the latest news one button
    Then User verifies new title result

  @LatestNews2HomeButtonBdd @HomeButtonBdd
  Scenario: Latest News 2
    Given User is on landing page
    When User clicks the latest news two button
    Then User verifies new title result

  @LatestNews3HomeButtonBdd @HomeButtonBdd
  Scenario: Latest News 3
    Given User is on landing page
    When User clicks the latest news three button
    Then User verifies new title result

  @ReadMore2HomeButtonBdd @HomeButtonBdd
  Scenario: Read More 2
    Given User is on landing page
    When User clicks the read more two button
    Then User verifies new title result