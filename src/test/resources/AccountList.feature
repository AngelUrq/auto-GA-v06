Feature: Select an account

  Background:
    Given Account manager is loaded

  Scenario: New account button is visible on 'Account List'
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then check if "A new account" button is visible on 'Account Manager'

  Scenario: Choose a new account on 'Account List'
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    And click "A new account" button on 'Account Manager'
    Then 'Income' button is visible on 'Account Main Menu'

  Scenario: Choose the general user account on 'Account List'
    And click 'General' account button on 'Account Manager'
    Then title is visible on 'General Reports'

  Scenario: New account is visible on 'Account List'
    And create account "ACCOUNT_NAME_1" on 'Account Creator'
    Then "ACCOUNT_NAME_1" button is visible on 'Account Manager'

  Scenario Outline: New accounts buttons are visible on 'Account List'
    And create accounts of "<listOfAccountNames>" on 'Account Creator'
    Then "<listOfAccountNames>" buttons are visible on 'Account Manager'
    Examples:
    | listOfAccountNames |
    | Account 1, Account 2, Account 3, Account 4, Account 5 |

  Scenario: General account is visible on 'Account List'
    Then following accounts are visible on 'Account List'
    | Account name |
    | general |