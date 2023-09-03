Feature: Login

  @LoginTdd
  Scenario Outline: Login
    Given User is on the login page
    When Users enter <username> and <password>
    And User clicks the login button
    Then User gets verifies login <result>

    Examples:
      |  username  | password | result |
      |  moHawks62 |  mo1234  | Passed |
      |            |  mo1234  | Failed |
      |  moHawks63 |          | Failed |
      |            |          | Failed |