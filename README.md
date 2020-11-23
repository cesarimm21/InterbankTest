# InterbankTest
Proyecto realizado para interbank
Automatización de web http://automationpractice.com/index.php
Script desarrollado es 1-Agregar un articulo a carrito de compras

Automatización de api https://reqres.in/
Scripts desarrollado es 2 - lista de usuarios

# para la ejecucion de la web, habilitar en el archivo "serenity.conf" la opcion de driver
environments {
  default{
    webdriver.base.url = "http://automationpractice.com/index.php"
    #baseurl = "https://reqres.in/api"
  }
luego ejecutar en el runner el tag @AnhadirArticulo  
  
# para la ejecucion de la api, habilitar en el archivo "serenity.conf" la opcion de driver
environments {
  default{
    #webdriver.base.url = "http://automationpractice.com/index.php"
    baseurl = "https://reqres.in/api"
  }
luego ejecutar en el runner el tag @ListUsers
