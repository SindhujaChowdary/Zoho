Feature: Google Search

  Background: 
    Given Open Browser
    And enter url

  @smoke
  Scenario: Google Search valid
    
    When User given valid input    
    Then Field should be accept

  @ft
  Scenario: Google Search invalid
   
    When User given invalid input
    Then Field not should be accept
