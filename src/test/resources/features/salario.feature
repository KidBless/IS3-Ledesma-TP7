Feature: Cálculo de Salario

  Scenario: Calcular salario de un empleado por hora
    Given que tengo un empleado por hora llamado "Juan" con sueldo base 50000.0
    When trabajo 10 horas a un valor de 2000.0 por hora
    Then el salario total debería ser 70000.0