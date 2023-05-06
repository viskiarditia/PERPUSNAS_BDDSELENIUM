@Profile
Feature: Profile
  Scenario: Profile visi-misi
    Given User open the website perpusnas home page
    When User hover on the navbar profile
    And User hover on the navbar kelembagaan
    And User click submenu visi-misi
    Then User already on page visi-misi
