@tag
  Feature: Realizar un compra de un articulo
    @AnhadirArticulo
    Scenario Outline: 1-Agregar un articulo a carrito de compras
      Given que ingresamos al sistema My Store
      When buscamos el producto <producto>
      And verificamos la existencia del <producto>
      And agregamos al carito de compras
      Then validamos que el producto se haya agregado correctamente
      Examples:
      |producto|
      |Blouse|