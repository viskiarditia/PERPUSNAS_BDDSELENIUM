@Perpusnas @Direktori @KedutaanBesardanKonsulatAsing
Feature: Testing menu Kedutaan Besar dan Konsulat Asing
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Kedutaan Besar dan Konsulat Asing
  Scenario: "Kedutaan Besar dan Konsulat Asing "
    Then Click and Check All div class Kedutaan Besar dan Konsulat Asing in page