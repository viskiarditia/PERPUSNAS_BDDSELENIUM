Feature: Testing menu Hari Penting
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Hari Penting
  Scenario: "Hari Penting"
    Then Click and Check All div class Hari Penting in page
