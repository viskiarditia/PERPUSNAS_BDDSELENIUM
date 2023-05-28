@Perpusnas @Direktori @KantorBerita
Feature: Testing menu Kantor Berita
  Background:
    Given User open website perpusnas
    When click hover Koleksi Digital and go Direktori and click sub menu Kantor Berita
  Scenario: "Kantor Berita"
     Then Click and Check All div class Kantor Berita in page
