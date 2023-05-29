@Perpusnas @Direktori @PerpustakaanNasionalInternet
Feature: Testing menu Perpustakaan Nasional
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Perpustakaan Nasional Internet
  Scenario: "Perpustakaan Nasional Internet"
    Then Click and Check All div class  Perpustakaan Nasional Internet in page
