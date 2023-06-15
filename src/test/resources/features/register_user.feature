Feature: Registro de usuario nuevo
  Como usuario de Utest
  Quiero crear un nuevo registro
  Para acceder como usuario

  @newRegister
  Scenario: Creacion correcta de nueva cuenta
    Given un usuario en la pagina de inicio
    When el usuario crea una nueva cuenta
    Then el usuario ve su username