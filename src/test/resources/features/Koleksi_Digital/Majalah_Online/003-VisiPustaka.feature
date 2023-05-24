Feature: Testing menu Visi Pustaka
  Scenario: "Visi Pustaka Functionality Vol 1- load more"
    Given User open website perpusnas
    When click hover Koleksi Digital and go majalah online and click sub menu Visi Pustaka
    Then Click "Vol. 02 No. 2 - Desember  2000"
    And Click sub menu Visi Pustaka
    Then Click "Vol. 03 No. 1 - Juni 2001"
    And Click sub menu Visi Pustaka
    Then Click "Vol. 03 No. 2 - Desember 2001"
    And Click sub menu Visi Pustaka