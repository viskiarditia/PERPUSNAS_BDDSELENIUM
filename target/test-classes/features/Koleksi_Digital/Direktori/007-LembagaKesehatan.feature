@Perpusnas @Direktori @LembagaKesehatan
Feature: Testing menu Lembaga Kesehatan
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Lembaga Kesehatan
  Scenario: "Lembaga Kesehatan Functionality"
    Then Click and Check All div class Lembaga Kesehatan in page
