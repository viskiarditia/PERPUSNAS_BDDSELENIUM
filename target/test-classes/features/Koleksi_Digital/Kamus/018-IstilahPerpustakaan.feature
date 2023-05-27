Feature: Testing menu Perpustakaan Nasional
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Kamus and click sub menu Istilah Perpustakaan

  Scenario: "Istilah Perpustakaan"
    Given User open website perpusnas
    When click hover Koleksi Digital and go Kamus and click sub menu Istilah Perpustakaan
    Then Click div class Istilah Perpustakaan 1
    Then Click div class Istilah Perpustakaan 2
    Then Click div class Istilah Perpustakaan 3
    And Scroll Down page for next one step Istilah Perpustakaan