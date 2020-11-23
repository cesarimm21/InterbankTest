@tag
Feature:consulta de api de todo mis usuarios
  @ListUsers
  Scenario Outline: 2 - lista de usuarios
    When quiero realizar la consulta la lista de mis usuarios
    Then validar la lista de mis usuarioss
    Examples:
      |numero|usuario|
      |2|Michael|