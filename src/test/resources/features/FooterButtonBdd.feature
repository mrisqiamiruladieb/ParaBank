@All
Feature: Footer Button

  @HomeFooterButtonBdd @FooterButtonBdd
  Scenario: Home
    Given User is on homepage
    When User clicks the home button
    Then User verifies home button result

  @AboutUsFooterButtonBdd @FooterButtonBdd
  Scenario: About Us
    Given User is on homepage
    When User clicks the about us button
    Then User verifies about us button result

  @ServicesFooterButtonBdd @FooterButtonBdd
  Scenario: Services
    Given User is on homepage
    When User clicks the services button
    Then User verifies services button result

  @ServicesBookstoreSoapStore01FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store 01
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store one
    Then User verifies link store one result

  @ServicesBookstoreSoapStore01v2FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store 01v2
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store one v two
    Then User verifies link store one v two result

  @ServicesBookstoreSoapStoreWss01FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store Wss 01
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store wss one
    Then User verifies link store wss one result

  @ServicesBookstoreSoapDownloadSoatestPfxFooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Download Soatest Pfx
    Given User has set the download directory and is on the home page
    When User clicks the services button
    And User clicks the download file link button
    Then User verifies the result of the downloaded file

  @ServicesBookstoreSoapStoreWss02FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store Wss 02
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store wss two
    Then User verifies link store wss two result

  @ServicesBookstoreSoapStoreWss03FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store Wss 03
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store wss three
    Then User verifies link store wss three result

  @ServicesBookstoreSoapStoreWss04FooterButtonBdd @FooterButtonBdd
  Scenario: Services Bookstore Soap Store Wss 04
    Given User is on homepage
    When User clicks the services button
    And User clicks the link store wss four
    Then User verifies link store wss four result

  @ServicesParaBankSoapLoanProcessorFooterButtonBdd @FooterButtonBdd
  Scenario: Services ParaBank Soap Loan Processor
    Given User is on homepage
    When User clicks the services button
    And User clicks the link loan processor
    Then User verifies link loan processor result

  @ServicesParaBankSoapParaBankFooterButtonBdd @FooterButtonBdd
  Scenario: Services ParaBank Soap ParaBank
    Given User is on homepage
    When User clicks the services button
    And User clicks the link parabank
    Then User verifies link parabank result

  @ServicesRestfulWadlFooterButtonBdd @FooterButtonBdd
  Scenario: Services Restful Wadl
    Given User is on homepage
    When User clicks the services button
    And User clicks the link wadl
    Then User verifies link wadl result

  @ServicesRestfulSwaggerFooterButtonBdd @FooterButtonBdd
  Scenario: Services Restful Swagger
    Given User is on homepage
    When User clicks the services button
    And User clicks the link swagger
    Then User verifies link swagger result

  @ProductsFooterButtonBdd @FooterButtonBdd
  Scenario: Products
    Given User is on homepage
    When User clicks the products button
    Then User verifies products button result

  @LocationsFooterButtonBdd @FooterButtonBdd
  Scenario: Locations
    Given User is on homepage
    When User clicks the locations button
    Then User verifies locations button result

  @ForumFooterButtonBdd @FooterButtonBdd
  Scenario: Forum
    Given User is on homepage
    When User clicks the forum button
    Then User verifies forum button result

  @SiteMapAboutUsFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map About Us
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map about us button
    Then User verifies about us button result

  @SiteMapServicesFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Services
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map services button
    Then User verifies services button result

  @SiteMapProductsFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Products
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map products button
    Then User verifies products button result

  @SiteMapLocationsFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Locations
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map locations button
    Then User verifies locations button result

  @SiteMapAdminPageFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Admin Page
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map admin page button
    And User makes settings
    And User clicks the admin page submit button
    Then User verification creates setup results

  @SiteMapOpenNewAccountFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Open New Account
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map open new account button
    Then User verifies site map open new account button result

  @SiteMapAccountsOverviewFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Accounts Overview
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map accounts overview button
    Then User verifies site map accounts overview button result

  @SiteMapTransferFundsFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Transfer Funds
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map transfer funds button
    Then User verifies site map transfer funds button result

  @SiteMapBillPayFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Bill Pay
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map bill pay button
    Then User verifies site map bill pay button result

  @SiteMapFindTransactionsFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Find Transactions
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map find transactions button
    Then User verifies site map find transactions button result

  @SiteMapUpdateContactInfoFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Update Contact Info
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map update contact info button
    Then User verifies site map update contact info button result

  @SiteMapRequestLoanFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Request Loan
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map request loan button
    Then User verifies site map request loan button result

  @SiteMapLogoutFooterButtonBdd @FooterButtonBdd
  Scenario: Site Map Logout
    Given User is on homepage
    When User clicks the site map button
    And User clicks the site map logout button
    Then User verifies site map logout button result

  @ContactUsFooterButtonBdd @FooterButtonBdd
  Scenario: Contact Us
    Given User is on homepage
    When User clicks the contact us button
    Then User verifies contact us button result

  @VisitUsAtFooterButtonBdd @FooterButtonBdd
  Scenario: Visit Us At
    Given User is on homepage
    When User clicks the visit us at button
    Then User verifies visit us at button result