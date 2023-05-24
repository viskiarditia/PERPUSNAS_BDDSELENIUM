@Perpusnas @MajalahOnline @Jumantara
Feature: Testing menu Jumantara
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go majalah online and click sub menu Jumantara
  Scenario: "Jumantara Functionality Vol 1- Full in Page"
    Then Click Jumantara Volume 6 Nomor 1 - Tahun 2015 and return to the previous page
    Then Click Jumantara Volume 6 Nomor 2 - Tahun 2015 and return to the previous page
    Then Click Jumantara Volume 7 Nomor 1 - Tahun 2016 and return to the previous page
    And Scroll Down page for next one step
    Then Click Jumantara Volume 7 Nomor 2 - Tahun 2016 and return to the previous page
    And Scroll Down page for next one step
    Then Click Jumantara Volume 8 Nomor 1 - Tahun 2017 and return to the previous page
    And Scroll Down page for next one step
    Then Click Jumantara Volume 8 Nomor 2 - Tahun 2017 and return to the previous page
    And Scroll Down page for next two step
    Then Click Jumantara Volume 9 Nomor 1 - Tahun 2018 and return to the previous page
    And Scroll Down page for next two step
    Then Click Jumantara Volume 9 Nomor 2 - Tahun 2018 and return to the previous page
    And Scroll Down page for next two step
    Then Click Volume 9 Nomor 1 - Oktober Tahun 2010 and return to the previous page
    And Scroll Down page for next three step
    Then Click Volume 2 Nomor 1 - April Tahun 2010 and return to the previous page
    And Scroll Down page for next three step
    Then Click Volume 2 Nomor 2 - Oktober Tahun 2011 and return to the previous page
    And Scroll Down page for next three step
    Then Click Volume 3 Nomor 1 - April Tahun 2012 and return to the previous page
