Feature: Modify an existing income

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Income' button on 'Account Main Menu'
    And fill "Salario Junio" input on 'IncomeExpenses Page'
    And fill 'Category' field on 'Income Page'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    And verify if 'Transaction' has been registered on 'Income Page'

  Scenario: Modify created income
    Then select income registered on 'Income View'
    Then fill "New name" name input on 'Income View'
    Then select 'Others' different Income category on 'Income View'
    And fill "06/07/2020" new date input on 'Income View'
    And fill new "321" amount modify income on 'Income View'
    And click 'Register Changes' button on 'Income View'

    Scenario: No select registered income
      Then fill "New name" name input on 'Income View'
      Then select 'Others' different Income category on 'Income View'
      And fill "06/07/2020" new date input on 'Income View'
      And fill new "222" amount modify income on 'Income View'
      And click 'Register Changes' button on 'Income View'
      And check 'error message' display


        Scenario: No select 'category' option
          Then select income registered on 'Income View'
          Then fill "New name" name input on 'Income View'
          And fill "06/07/2020" new date input on 'Income View'
          And fill new "256" amount modify income on 'Income View'
          And click 'Register Changes' button on 'Income View'
          And check 'error message' display

          Scenario: No fill 'Date' input
            Then select income registered on 'Income View'
            Then fill "New name" name input on 'Income View'
            Then select 'Others' different Income category on 'Income View'
            And fill new "111" amount modify income on 'Income View'
            And click 'Register Changes' button on 'Income View'
            And check 'error message' display

            Scenario: No fill 'Amount' input
              Then select income registered on 'Income View'
              Then fill "New name" name input on 'Income View'
              Then select 'Others' different Income category on 'Income View'
              And fill "06/07/2020" new date input on 'Income View'
              And click 'Register Changes' button on 'Income View'
              And check 'error message' display

            Scenario: Clear 'Amount' input
              Then select income registered on 'Income View'
              Then fill "New name" name input on 'Income View'
              Then select 'Others' different Income category on 'Income View'
              And fill "06/07/2020" new date input on 'Income View'
              Then fill new "32" amount modify income on 'Income View'
              Then clear 'Amount' input on 'Income Page'
              And click 'Register Changes' button on 'Income View'
              And check 'error message' display

              Scenario: No fill 'New name' registered income
                Then select income registered on 'Income View'
                Then select 'Others' different Income category on 'Income View'
                And fill "06/07/2020" new date input on 'Income View'
                And fill new "33" amount modify income on 'Income View'
                And click 'Register Changes' button on 'Income View'
                And check 'error message' display


