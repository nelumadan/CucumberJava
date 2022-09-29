@googlesearch
Feature: feature to test google search functionality

  Background: browser is opened
    Given browser is opened
    And user is on google search page
  
  Scenario: Validate google search is working
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results

    Scenario: Validate store link is working
     When user clicks store link
     Then user is navigated to store page