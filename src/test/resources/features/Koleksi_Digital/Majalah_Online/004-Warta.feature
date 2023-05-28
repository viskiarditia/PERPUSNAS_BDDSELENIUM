@Perpusnas @MajalahOnline @Warta
Feature: Testing menu Warta
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go majalah online and click sub menu Warta
  Scenario: "Warta Functionality Vol 1- load more"
    Then Click Volume 19 Nomor 1 - Januari Tahun 2014 and return to the previous page
    Then Click Volume 19 Nomor 1 - April Tahun 2014 and return to the previous page