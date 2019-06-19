Feature: Add to Cart Product
  Background: Load Page
    Given Home Page is loaded

  Scenario: Select item
    Then Hover over 'Hombre' Bar link
    Then Click 'Futbol' link
    Then Get 'Product Value' string
    Then click 'Product' button
    Then click 'Select' button
    Then click 'Size' button
    Then click 'Add to Cart' button
    Then check 'Product' quantity
    Then click 'See Cart' button on 'Modal Product'
    Then check 'Product' selected is registered on 'Cart Page'
    Then check 'Product price' is equal to selected on 'Cart Page'