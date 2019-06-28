Feature: Register a new expense

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Expenses' button on 'Account Main Menu'
    Then go back home in 'Expenses'
    And click 'Income' button
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And fill 'Category' field on 'Income Page'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    Then go back home in 'Expenses'
    And click 'Expenses' button on 'Account Main Menu'

  Scenario: Create a new Expense
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'

  Scenario: No fill on 'Name' input
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And 'Transaction error' is visible on 'IncomeExpenses Page'

  Scenario: No select on 'Category' Selector
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And 'Transaction error' is visible on 'IncomeExpenses Page'

  Scenario: No fill 'Amount' input
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And 'Transaction error' is visible on 'IncomeExpenses Page'

  Scenario: No select 'Date' selector
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And 'Transaction error' is visible on 'IncomeExpenses Page'


  Scenario: Can not register an expense for an account that does not have enough money
    Then fill "My expense" in 'Enter Name' input on 'Income Expenses View'
    And select 'Category' field on 'Income Expenses View'
    And fill "200" 'Enter amount' input on 'Income Expenses View'
    And fill "01/01/2019" 'Date' input on 'Income Expenses View'
    And click 'Register Transaction' button on 'Income Expenses View'
    And 'Transaction error' is visible on 'IncomeExpenses Page'

  Scenario: Can not enter letters in the amount field
    And fill "abc" 'Enter amount' input on 'Income Expenses View'
    Then 'Enter amount' input is empty
