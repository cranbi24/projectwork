Feature: Add product to cart

    Background:
      Given I open Tesco webshop website
      And I accept all cockies

    Scenario: When I choose a product and add to the cart, it will be added to the cart
      Given search field is visible
      When I write a name in the search field
      And I click on the 'Search' button
      Then shows the results for the name

