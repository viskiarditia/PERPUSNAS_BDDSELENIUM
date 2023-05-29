@Perpusnas @MajalahOnline @MediaPustakawan
Feature: Testing menu Media  Pustakawan
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go majalah online and click sub menu Media  Pustakawan
  Scenario: "Media  Pustakawan Functionality Vol 1- load more"
    Then Click Volume 17 Nomor 3 - Juni Tahun 2010 and return to the previous page
    Then Click Volume 19 Nomor 1 - Maret Tahun 2012 and return to the previous page
    Then Click Volume 19 Nomor 2 - April Tahun 2012 and return to the previous page
    And Scroll Down page for next one step
    Then Click Volume 2 Nomor 2 - Juli Tahun 1995 and return to the previous page
    And Scroll Down page for next one step
    Then Click Volume 20 Nomor 1 - April Tahun 2013 and return to the previous page
    And Scroll Down page for next one step
    Then Click Volume 20 Nomor 2 - Januari Tahun 2013

