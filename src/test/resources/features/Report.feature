Feature: Obtain a report of First Account(FA) by date or category
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
    And Click 'Report' button in 'Account Main Menu' Page

  Scenario: Obtain a report of First Account(FA) by date from a date A to a date B
      And select 'By date' option
      And StartDate field is visible
      And EndtDate field is visible
      And fill "01/01/2019" start date input
      And fill "12/30/2019" end date input
      And Report button is visible
    Then click 'Show Report' button

  Scenario: Obtain a report of First Account(FA) by category from a date A to a date B
      And select 'By category' option
    Then click 'Show Report' button

  Scenario: Enter invalid characters into date fields must be invalid
      And select 'By date' option
      And fill "mm/dd/yyyy" start date input
      And fill "mm/dd/yyyy" end date input
    Then click 'Show Report' button

  Scenario: Enter special characters into date fields must be invalid
      And select 'By date' option
      And fill "**/**/****" start date input
      And fill "--/--/----" end date input
    Then click 'Show Report' button

  Scenario: Enter invalid format into date fields must be invalid
      And select 'By date' option
      And fill "25/01/2019" start date input
      And fill "30/12/2019" end date input
    Then click 'Show Report' button
