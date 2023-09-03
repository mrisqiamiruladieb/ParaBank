@All
Feature: Login

  @PositiveLoginBdd @LoginBdd
  Scenario: Login Successful
    Given User is on the login page
    When User enters username and password
    And User clicks the login button
    Then User verifies login results

  @NegativeLoginBdd @LoginBdd
  Scenario: Login Failed
    Given User is on the login page
    When User clicks the login button
    Then User gets a login error message