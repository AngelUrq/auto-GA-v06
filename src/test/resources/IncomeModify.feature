Feature: Modify an existing income

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Income' button on 'Account Main Menu'
    And fill 'Enter Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button

  Scenario: Modify created income
    Then select income registered on 'Income View'
    Then fill "New name" name input on 'Income View'
    Then select 'Others' different Income category on 'Income View'
    And fill 'mm/dd/yyyy' new date input on 'Expenses View'
    And fill new "321" amount modify income on 'Income View'
    And click 'Register Changes' button on 'Income View'

    Scenario: No select registered income
      Then fill "New name" name input on 'Income View'
      Then select 'Others' different Income category on 'Income View'
      And fill 'mm/dd/yyyy' new date input on 'Expenses View'
      And fill new "222" amount modify income on 'Income View'
      And click 'Register Changes' button on 'Income View'
      And check 'error message' display

      Scenario: No fill 'New name' registered income
        Then select income registered on 'Income View'
        Then select 'Others' different Income category on 'Income View'
        And fill 'mm/dd/yyyy' new date input on 'Expenses View'
        And fill new "33" amount modify income on 'Income View'
        And click 'Register Changes' button on 'Income View'
        And check 'error message' display

        Scenario: No select 'category' option
          Then select income registered on 'Income View'
          Then fill "New name" name input on 'Income View'
          And fill 'mm/dd/yyyy' new date input on 'Expenses View'
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


