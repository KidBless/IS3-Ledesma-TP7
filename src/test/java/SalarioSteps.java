import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class SalarioSteps {
    private EmpleadoPorHora empleado;
    private double salarioCalculado;

    @Given("que tengo un empleado por hora llamado {string} con sueldo base {double}")
    public void crearEmpleado(String nombre, double sueldoBase) {
        empleado = new EmpleadoPorHora(nombre, "12345678", sueldoBase, 0, 0);
    }

    @When("trabajo {int} horas a un valor de {double} por hora")
    public void calcularSalario(int horas, double valorHora) {
        // Acá actualizamos los datos del empleado antes de calcular
        empleado = new EmpleadoPorHora(empleado.toString(), "12345678", 50000.0, horas, valorHora);
        salarioCalculado = empleado.calcularSalario();
    }

    @Then("el salario total debería ser {double}")
    public void verificarResultado(double esperado) {
        assertEquals(esperado, salarioCalculado);
    }
}