Feature: Add a pair of tennis shoes verify quantity price
Given Account creator is loaded
  Scenario: Select gender and category of shoes on AdidasMainPage
      And Mouseover 'HOMBRE' option
      And Click 'Futbol' option
  Scenario: Select 'CALZADO NEMEZIZ' on CalzadoHombrePage
      And Get price of the first item
      And Click on first item
  Scenario: Choose size, quantity of product and add to cart on SingleTennisPage
      And Click on 'ELIGE TU TALLA' button
      And Click on size required option
      And Click on 'ANADIR AL CARRITO' button
      And Quantity on Cart icon is 'One'
      And Click on 'VER CARRITO' button
  Scenario: Check title,Quanity,Partial Price and Total Price on TennisCart
      And Title of product is 'CALZADO DE FÚTBOL NEMEZIZ'
      And Quantity of item is 'One'
      And Partial price is '2.199'
    Then Total price is '2.199'
