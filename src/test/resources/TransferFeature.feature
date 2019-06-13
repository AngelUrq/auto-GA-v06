Feature: Transfer between accounts First Account(FA) and Second Account(SA)
  Background: : Create Accounts and do incomes
    Given Account creator is loaded
    And fill 'Account name' input with first account
    And click 'Add' button for first account
    And fill 'Account name' input with second account
    And click 'Add' button for second account
    Then select first account
    And click 'Income' button
    And fill 'Enter Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button
    Then click 'Exit' Button
    And  Then select first account again

  Scenario: Do a transfer of an amount from first account to second account
    And click 'Transfer' button
    And select 'Second Account' option
    And fill "10" on field amount
    Then click 'Transfer' button on transfer page

  Scenario: Don't do a transfer of an amount from FA to SA where the amount is greater than the balance
    And click 'Transfer' button
    And select 'Second Account' option
    And fill "1100" on field amount
    Then click 'Transfer' button on transfer page

  Scenario: Don't do a transfer of an amount from FA to SA where the amount is negative
    And click 'Transfer' button
    And select 'Second Account' option
    And fill "-100" on field amount
    Then click 'Transfer' button on transfer page