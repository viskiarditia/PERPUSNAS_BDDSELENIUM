Feature: Testing menu Perpustakaan Khusus
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Perpustakaan Khusus Internet
  Scenario: "Perpustakaan Khusus Internet"
    Then Click and Check All div class Perpustakaan Khusus Internet in page
