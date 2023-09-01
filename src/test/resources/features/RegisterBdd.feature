@All
Feature: Register

  @PositiveRegisterBdd @RegisterBdd
  Scenario: Register Successful
    Given User is on the registration page
    When User fills in the registration data
    And User fills in username and password
    And User clicks the register button
    Then User verifies register results

  @NegativeRegisterBdd @RegisterBdd
  Scenario: Register Failed
    Given User is on the registration page
    When User clicks the register button
    Then User gets an error message