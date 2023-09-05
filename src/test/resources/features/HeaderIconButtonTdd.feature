Feature: Header Icon Button

  @HeaderIconButtonTdd
  Scenario Outline: Mail Icon
    Given User is on the home page
    When User clicks the mail icon button
    And User enters email data and <name>
    And User clicks the send to customer care submit button
    Then User gets verifies mail icon <result>

    Examples:
    |  name   | result |
    | Morgans | Passed |
    |         | Failed |