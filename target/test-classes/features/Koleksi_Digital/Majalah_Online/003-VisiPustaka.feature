Feature: Testing menu Visi Pustaka
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go majalah online and click sub menu Visi Pustaka
  Scenario: "Visi Pustaka Functionality Vol 1- load more"
    Then Click Volume 02 Nomor 2 - Desember Tahun 2000 and return to the previous page
    Then Click Volume 03 Nomor 1 - Juni Tahun 2001 and return to the previous page
    Then Click Volume 03 Nomor 2 - Desember Tahun 2001 and return to the previous page
