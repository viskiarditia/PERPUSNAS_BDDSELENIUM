@Perpusnas @Beranda @ISBN
Feature: Testing menu ISBN
  Background:
    Given User open website perpusnas
    When click Menu Beranda
  Scenario: "Users Click menu ISBN and Search konten with index <kangen>"
    Then Click menu ISBN and Search konten with index "kangen"