Feature: ELiminar ingresos y egresos


  Background:

    #Añade una cuenta

    Given  Browser is loaded
    And fill "Mateo" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then Get length of 'Account List' List in 'Account Creator' Page
    Then click "Mateo" button on 'Account Manager'

    #Añade un ingreso

    And click 'Income' button
    And fill "Mateo" input on 'IncomeExpenses Page'
    And fill 'Category' field on 'Income Page'
    And fill arbitrary "2000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    When 'Navbar' is loaded in 'Income' page
    Then Click 'Personal Wallet' Button in 'NavBar' Page

     #Añade un egreso

    When 'Account Main Menu' Page is loaded
    Then click 'Expenses' button on 'Account Main Menu'
    And fill "Celular" input on 'IncomeExpenses Page'
    And select 'Category' field on 'Income Expenses View'
    And fill arbitrary "1000" amount on 'IncomeExpenses Page'
    And fill arbitrary "02/05/2019" date on 'IncomeExpenses Page'
    Then click 'Register Transaction' button on 'IncomeExpenses Page'
    Then Click 'Personal Wallet' Button in 'NavBar' Page

  Scenario: Verify 'Delete' Button deletes income in 'Report Table' Page

    When  'Account Main Menu' Page is loaded
    Then Click 'Report' button in 'Account Main Menu' Page
    And Click 'Report Type' Selector in 'Report' Page
    And Click 'By category' Type in 'Report Type Selector' in 'Report' Page
    Then Click 'Show Report' Button in 'Report' Page
    And Click 'Mateo' delete button in 'Report' table in 'Report' page

  Scenario: Verify 'Delete' Button deletes expense in 'Report Table' Page

    When  'Account Main Menu' Page is loaded
    Then Click 'Report' button in 'Account Main Menu' Page
    And Click 'Report Type' Selector in 'Report' Page
    And Click 'By category' Type in 'Report Type Selector' in 'Report' Page
    Then Click 'Show Report' Button in 'Report' Page
    And Click 'Celular' delete button in 'Report' table in 'Report' page

   Scenario:  Verify Account containing expenses or income cannot be deleted

     Then Click 'Account Settings' button in 'Reports Navbar' Page
     And Click 'Delete' button in Account Settings
     Then List 'Account List' length should not change in 'Account Creator Page'
