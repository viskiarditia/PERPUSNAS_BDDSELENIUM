@Login
  Feature: Login
    As a user I want to login website instagram

  Scenario Outline: Normal login
#    Given Input valid email and password registered
    When User input Name Account "<email>>" and Password "<password>"
    Then User already on Home page

    Examples:
      | email | password |
      | dsfdf | dfddf    |