@All
Feature: Header Button

  @ParaBankLogoHeaderButtonBdd @HeaderButtonBdd
  Scenario: ParaBank Logo
    Given User is on home page
    When User clicks the parabank logo button
    Then User verifies parabank logo button result

  @AdminPageLogoHeaderButtonBdd @HeaderButtonBdd
  Scenario: Admin Page Logo
    Given User is on home page
    When User clicks the admin page logo button
    Then User verifies admin page logo button result