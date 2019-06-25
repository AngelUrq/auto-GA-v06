Feature: Obtain a report of First Account(FA) by date or category
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

  Scenario: Obtain a report of First Account(FA) by date from a date A to a date B
      And click 'Report' button
      And select 'By date' option
       And EndtDate field is visible
      And fill "01/01/2019" start date input
      And fill "12/30/2019" end date input
      And Report button is visible
    Then click 'Show Report' button

  Scenario: Obtain a report of First Account(FA) by category from a date A to a date B
      And click 'Report' button
      And select 'By category' option
    Then click 'Show Report' button

  Scenario: Enter invalid characters into date fields must be invalid
      And click 'Report' button
      And select 'By date' option
      And fill "mm/dd/yyyy" start date input
      And fill "mm/dd/yyyy" end date input
    Then click 'Show Report' button

  Scenario: Enter special characters into date fields must be invalid
      And click 'Report' button
      And select 'By date' option
      And fill "**/**/****" start date input
      And fill "--/--/----" end date input
    Then click 'Show Report' button

  Scenario: Enter invalid format into date fields must be invalid
      And click 'Report' button
      And select 'By date' option
      And fill "25/01/2019" start date input
      And fill "30/12/2019" end date input
    Then click 'Show Report' button
