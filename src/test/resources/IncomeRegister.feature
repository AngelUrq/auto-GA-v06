Feature: Register a new Income
  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Income' button

  Scenario: Create a new Income
    And fill "Nombre Income" input on 'IncomeExpenses Page'
    And fill 'Category' field on 'Income Page'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And verify if 'Transaction' has been registered on 'Income Page'


  Scenario: No fill on 'Name' input
    And fill 'Category' field on 'Income Page'
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
        And fill 'Category' field on 'Income Page'
        And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
        Then click 'Register Transaction' button on 'IncomeExpenses Page'
        And 'Transaction error' is visible on 'IncomeExpenses Page'

        Scenario: No select 'Date' selector
          And fill "Nombre Income" input on 'IncomeExpenses Page'
          And fill 'Category' field on 'Income Page'
          And fill arbitrary "1000" amount on 'IncomeExpenses Page'
          Then click 'Register Transaction' button on 'IncomeExpenses Page'
          And 'Transaction error' is visible on 'IncomeExpenses Page'

