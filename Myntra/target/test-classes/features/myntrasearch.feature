Feature: feature to test myntra search functionality

  Scenario: validate myntra search is working
    Given browser is open
    And user is on myntra search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to serach results
