Feature: Modify Language

  Rule: Language modification is allowed to hungarian or english

    Background:
      Given I open Tesco webshop website
      And I accept all cockies

    Scenario: I change the language to Hungarian or English
      Given language is set to 'Hungarian'
      When I change the language to 'English'
      Then language is changed to 'English'
      When I change the language to 'Hungarian'
      Then language is changed to 'Hungarian'