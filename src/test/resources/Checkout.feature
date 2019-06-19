Feature: Checkout

  Scenario: Buy new shoes
    Given Browser is loaded
    And Hover 'Hombre' on 'Home Page'
    Then click 'Futbol' on 'Home Page'
    And look for price of 'First shoes' on 'Shop Page'
    And click 'First shoes' on 'Shop Page'
    Then select "MX 8.5" in 'Talla' selector on 'Shoes Page'
    And click 'Añadir al carrito' button on 'Shoes Page'
    Then span 'Cantidad' text should be "Cantidad: 1" on 'Shoes Page'
    And click 'Ver el carrito' button on 'Shoes Page'
    Then 'Calzado de Fútbol Nemeziz 19.3 Terreno Firme' title should be displayed on 'Shoes Page'
    And 'Quantity' should be "1" on 'Shoes Page'
    And 'Total del producto' should be equal to shoes price on 'Shoes page'
    And 'Total' should be equal to shoes price on 'Shoes page'