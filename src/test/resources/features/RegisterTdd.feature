Feature: Register

  @RegisterTdd
  Scenario Outline: Register
    Given User is on the registration page
    When User fills in the registration data
    And User inputs in <username> and <password> and <confirm_password>
    And User clicks the register button
    Then User gets verify register <result>

    Examples:
    |  username  | password | confirm_password |  result  |
    |  moHawks62 |  mo1234  |      mo1234      |  Passed  |
    |            |  mo1234  |      mo1234      | Failed 1 |
    |  moHawks63 |          |                  | Failed 2 |
    |            |          |                  | Failed 3 |