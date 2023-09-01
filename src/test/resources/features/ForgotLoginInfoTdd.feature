Feature: Forgot Login Info

  @ForgotLoginInfoTdd
  Scenario Outline: Find Login Info
    Given User is on the landing page
    When User clicks the forgot login info button
    And User fills the account data and <firstname>
    And User clicks the find my login info submit button
    Then User gets the login info <result>

    Examples:
    |  firstname |  result  |
    |   Morgans  |  Passed  |
    | wrong_name | Failed 1 |
    |            | Failed 2 |