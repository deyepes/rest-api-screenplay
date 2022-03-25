Feature: Consumir una API Rest

  Como usuario
  Quiero poder crear un empleado
  Para dejar el registro en mi base de datos

  Scenario: Creacion exitosa de un empleado

    Given que quiero crear un empleado
    When lo creo con el nombre "Empleado" salario "1234" edad "30"
    Then deberia responder con un estado "success"