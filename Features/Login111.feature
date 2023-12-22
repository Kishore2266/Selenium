Feature: Login Test

  @smoke
  Scenario Outline: Validate the Login Functionality with valid credentials
    Given browser is open
    And user is in Login page
    When user enters <username> and <password>
    And user clicks Login button
    Then user navigated to the respected page

    Examples: 
      | username    | password  |
      | mahesh23456 | India@123 |
      | kiran3456   | Kiran@123 |
      | Amar4567    | Amar@123  |
