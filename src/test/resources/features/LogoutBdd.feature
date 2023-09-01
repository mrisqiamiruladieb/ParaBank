@All
Feature: Logout

  @LogoutBdd
  Scenario: Logout
    Given User has logged in
    When User clicks the logout button
    Then User verifies logout results