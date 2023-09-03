@All
Feature: Update Contact Info

  @PositiveUpdateContactInfoBdd @UpdateContactInfoBdd
  Scenario: Update Contact Info Successful
    Given User is on update contact info page
    When User fills in the update profile data
    And User clicks the update profile submit button
    Then Users verify updated profile results

  @NegativeUpdateContactInfoBdd @UpdateContactInfoBdd
  Scenario: Update Contact Info Failed
    Given User is on update contact info page
    When User is not fulfilled the update profile data
    Then Users get the required update profile data error message