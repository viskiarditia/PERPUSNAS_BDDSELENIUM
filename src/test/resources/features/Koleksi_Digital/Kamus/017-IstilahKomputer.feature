Feature: Testing menu Istilah Komputer
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Kamus and click sub menu Istilah Komputer

  Scenario: "Istilah Komputer"
    Then Click div class Istilah Komputer 1
    Then Click div class Istilah Komputer 2
    Then Click div class Istilah Komputer 3
    And Scroll Down page for next one step Istilah Komputer
    Then Click div class Istilah Komputer 4
    Then Click div class Istilah Komputer 5
    Then Click div class Istilah Komputer 6
