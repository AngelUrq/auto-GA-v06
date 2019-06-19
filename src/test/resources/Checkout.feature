Feature: Checkout

  Scenario: Buy new shoes
    Given Browser is loaded
    And Hover 'Hombre' on 'Home Page'
    Then click 'Futbol' on 'Home Page'
    And look for price of 'First shoes' on 'Shop Page'
    And click 'First shoes' on 'Shop Page'



