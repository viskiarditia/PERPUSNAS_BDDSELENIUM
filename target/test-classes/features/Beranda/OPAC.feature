@Perpusnas @Beranda @OPAC
Feature: Testing menu OPAC
  Background:
    Given User open website perpusnas
    When click Menu Beranda
  Scenario: "Users Click menu OPAC"
    Then Click menu OPAC and Search konten with index "Siaga" and Filter "Subyek" and "Semua Jenis Bahan"