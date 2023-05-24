Feature: Testing menu Media  Pustakawan
  Scenario: "Media  Pustakawan Functionality Vol 1- load more"
    Given User open website perpusnas
    When click hover Koleksi Digital nd go majalah online and click sub menu Media  Pustakawan
    And Scroll Down page
    Then Click " Vol. 17 no.3 - Juni 2010"
    And Click sub menu Media  Pustakawan
    Then Click "Vol. 19 no.1 -  Maret 2012"
    And Click sub menu Media  Pustakawan
    Then Click "Vol. 19 no.2 - April 2012"
    And Click sub menu Media  Pustakawan
    And Scroll Down page
    Then Click "Vol. 2 no.2 - Juli 1995"
    And Click sub menu Media  Pustakawan
    Then Click "Vol. 20 no.1 - April 2013"
    And Click sub menu Media  Pustakawan
    Then Click "Vol. 20 no.2 - Januari 2013"
    And Click sub menu Media  Pustakawan
