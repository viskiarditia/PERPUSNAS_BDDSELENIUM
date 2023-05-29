@Perpusnas @Direktori @Penerbit
Feature: Testing menu Penerbit
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Penerbit
  Scenario: "Penerbit"
    Then Click and Check All div class Penerbit in page