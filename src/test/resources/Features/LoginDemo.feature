@testprojectdemo
Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Neelam   |    12345 |
      | Anil     |    12345 |
