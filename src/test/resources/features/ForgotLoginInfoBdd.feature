@All
Feature: Forgot Login Info

  @PositiveForgotLoginInfoBdd @ForgotLoginInfoBdd
  Scenario: Find Login Info Successful
    Given User is on the landing page
    When User clicks the forgot login info button
    And User fills the account data
    And User clicks the find my login info submit button
    Then User gets the login info results

  @NegativeForgotLoginInfoBdd @ForgotLoginInfoBdd
  Scenario: Find Login Info Failed
    Given User is on the landing page
    When User clicks the forgot login info button
    And User is not fulfilled the account data
    And User clicks the find my login info submit button
    Then Users get the required account data error message