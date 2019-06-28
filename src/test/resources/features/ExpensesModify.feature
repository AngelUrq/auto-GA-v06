Feature: Modify an existing expense

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
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'

    Scenario: Create a new Expense and Modify it
      Then select expense registered on 'Expense View'
      Then fill "New name" name input on 'Expenses View'
      Then select 'Expenses' different Expense category on 'Expenses View'
      And fill 'mm/dd/yyyy' new date input on 'Expenses View'
      And fill new "222" amount modify expense on 'Expenses View'
      And click 'Register Changes' button on 'Expenses View'


  Scenario: Can not enter letters in the modify amount field
    And fill "abc" 'Enter new amount' input on 'Income Expenses View'
    Then 'Enter new amount' input is zero
