Feature: Transfer between accounts First Account(FA) and Second Account(SA)
  Background: : Create Accounts and do incomes
    Given Account manager is loaded
      And fill "First Account" 'Account name' input on 'Account Manager'
      And click 'Add' button on 'Account Manager'
      And fill "Second Account" 'Account name' input on 'Account Manager'
      And click 'Add' button on 'Account Manager'
      And click "First Account" button on 'Account Manager'
      And click 'Income' button on 'Account Main Menu'
      And fill "Salary June" 'Enter Name' input on 'Income View'
      And select 'Category' field on 'Income Expenses View'
      And fill "2000" 'Enter amount' input on 'Income Expenses View'
      And fill "06/06/2019" 'Date' input on 'Income Expenses View'
      And click 'Register Transaction' button on 'Income Expenses View'
      And go back home in 'Income'
      And click 'Transfer' button on 'Account Main Menu'

  Scenario: Do a transfer of an amount from first account to second account
      And select 'Second Account' option
      And fill "10" on field amount
      And Transfer button is visible
    Then click 'Transfer' button on transfer page

  Scenario: Don't do a transfer of an amount from FA to SA where the amount is greater than the balance
      And select 'Second Account' option
      And Transfer button is visible
      And fill "1100" on field amount
    Then click 'Transfer' button on transfer page

  Scenario: Don't do a transfer of an amount from FA to SA where the amount is negative
      And select 'Second Account' option
      And Transfer button is visible
      And fill "-100" on field amount
    Then click 'Transfer' button on transfer page

  Scenario: Don't do a transfer entering a letter from FA to SA
      And select 'Second Account' option
      And Transfer button is visible
      And fill "abce" on field amount
    Then click 'Transfer' button on transfer page
