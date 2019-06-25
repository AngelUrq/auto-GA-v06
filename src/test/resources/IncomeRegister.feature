Feature: Register a new Income
  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Income' button

  Scenario: Create a new Income
    And fill 'Enter Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button

  Scenario: No fill on 'Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button
    And 'Transaction error' is visible

  Scenario: No select on 'Category' Selector
      And fill 'Enter Name' input
      And fill 'Enter Amount' input
      And fill 'mm/dd/yyyy' input
      Then click 'Register Transaction' button
      And 'Transaction error' is visible

      Scenario: No fill 'Amount' input
        And fill 'Enter Name' input
        And fill 'Category' field
        And fill 'mm/dd/yyyy' input
        Then click 'Register Transaction' button
        And 'Transaction error' is visible

        Scenario: No select 'Date' selector
          And fill 'Enter Name' input
          And fill 'Category' field
          And fill 'Enter Amount' input
          Then click 'Register Transaction' button
          And 'Transaction error' is visible

