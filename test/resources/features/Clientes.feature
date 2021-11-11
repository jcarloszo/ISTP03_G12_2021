Feature: Identificacion de Clientes
  Scenario: Cliente inexistente
    Given Dado un cliente con CUIT 20411846459
    When ingreso un CUIT 20411847459
    Then Veo un mensaje "Cliente inexistente"
