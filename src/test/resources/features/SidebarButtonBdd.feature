@All
Feature: Sidebar Button

  @AboutUsSidebarButtonBdd @SidebarButtonBdd
  Scenario: About Us
    Given User is on the homepage
    When User clicks the about us sidebar button
    Then User verifies about us sidebar button result

  @ServicesSidebarButtonBdd @SidebarButtonBdd
  Scenario: Services
    Given User is on the homepage
    When User clicks the services sidebar button
    Then User verifies services sidebar button result

  @ProductsSidebarButtonBdd @SidebarButtonBdd
  Scenario: Products
    Given User is on the homepage
    When User clicks the products sidebar button
    Then User verifies products sidebar button result

  @LocationsSidebarButtonBdd @SidebarButtonBdd
  Scenario: Locations
    Given User is on the homepage
    When User clicks the locations sidebar button
    Then User verifies locations sidebar button result

  @AdminPageSidebarButtonBdd @SidebarButtonBdd
  Scenario: Admin Page
    Given User is on the homepage
    When User clicks the admin page sidebar button
    Then User verifies admin page sidebar button result