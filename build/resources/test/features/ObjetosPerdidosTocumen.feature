#Author: Juan David Galeano
Feature: Reto Bancolombia
  Yo como usuario de los servicios de Tocumen
  Deseo ingresar a la seccion de objetos perdidos
  para

  @IngresoCurso
  Scenario: Ingresar a Tocumen
    Given Ingreso a Tocumen Panama
    When Accedo a objetos extraviados
    Then Verifico pdf