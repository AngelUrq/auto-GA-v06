Feature: Register a Category
  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Income' button

    Scenario: Create a new Category
      Then fill category "Test Category" input on 'IncomeExpenses Page'
      And click 'Register Category' button on 'IncomeExpenses Page'
      And verify 'Registered Category' message on 'IncomeExpenses Page'
