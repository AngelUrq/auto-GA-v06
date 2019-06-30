Feature: General account

  Scenario: Can not access to 'Account main menu' page in the general account
    Given Account manager is loaded
    And click "general" button on 'Account Manager'
    And go to "account-main-menu" URL in the browser
    Then can not enter to main menu of the general account
