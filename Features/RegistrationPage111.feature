Feature: Registration Test

  @regression
  Scenario: Validate the Registration Functionality
    Given browser is opened
    And user is in RegistrationPage
    When user enters required credentials
    And user click Register button
    Then user is navigated to the selectHotel Page
