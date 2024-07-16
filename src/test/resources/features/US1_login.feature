Feature: Verification of login success

  Background:
      Given I open Tesco webshop website
      And I accept all cockies

    Scenario: When I give a correct username and password, the login is success
      Given the login page is open
      When I give the username
      And I give the password
      Then login is done
