@All
Feature: Header Icon Button

  @HomeIconHeaderIconButtonBdd @HeaderIconButtonBdd
  Scenario: Home Icon
    Given User is on the home page
    When User clicks the home icon button
    Then User verifies home icon button result

  @PeopleIconHeaderIconButtonBdd @HeaderIconButtonBdd
  Scenario: People Icon
    Given User is on the home page
    When User clicks the people icon button
    Then User verifies people icon button result

  @PositiveMailIconHeaderIconButtonBdd @HeaderIconButtonBdd
  Scenario: Mail Icon Successful
    Given User is on the home page
    When User clicks the mail icon button
    And User fills in email data
    And User clicks the send to customer care submit button
    Then User verifies mail icon result

  @NegativeMailIconHeaderIconButtonBdd @HeaderIconButtonBdd
  Scenario: Mail Icon Failed
    Given User is on the home page
    When User clicks the mail icon button
    And User is not fulfilled the email data
    And User clicks the send to customer care submit button
    Then Users get the required email data error message