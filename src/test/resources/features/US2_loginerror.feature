Feature: Check for login failure

  Background:
      Given I open Tesco webshop website
      And I accept all cockies

    Scenario: When I give an incorrect username or password, the login is failed
      Given the login page is open
      When I give a wrong username
      And I give the password
      Then login doesn't success, comes error message

  Scenario: When I give an incorrect username or password, the login is failed
    Given the login page is open
    When I give a correct username
    And I give a wrong password
    Then login doesn't success, comes error message