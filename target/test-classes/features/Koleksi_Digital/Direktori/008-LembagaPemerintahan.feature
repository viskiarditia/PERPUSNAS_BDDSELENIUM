Feature: Testing menu Lembaga Pemerintahan
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Lembaga Pemerintahan
  Scenario: "Lembaga Pemerintahan"
    Then Click and Check All div class Lembaga Pemerintahan in page
