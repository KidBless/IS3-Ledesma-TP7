import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoPorHoraTest {

    @Test
    public void testCalcularSalario() {
        // 1. DADO (Arrange): Preparamos los datos de nuestro empleado de prueba
        // Pasamos: Nombre, DNI, Sueldo Base, Horas Trabajadas, Valor por Hora
        double sueldoBase = 100000.0;
        int horasTrabajadas = 10;
        double valorHora = 5000.0;
        
        EmpleadoPorHora empleado = new EmpleadoPorHora(
                "Juan Perez", 
                "12345678", 
                sueldoBase, 
                horasTrabajadas, 
                valorHora
        );

        // 2. CUANDO (Act): Ejecutamos el método que queremos poner a prueba
        // El cálculo debería ser: 100000 + (10 * 5000) = 150000
        double salarioEsperado = 150000.0;
        double salarioCalculado = empleado.calcularSalario();

        // 3. ENTONCES (Assert): Comprobamos que el resultado sea exactamente el que esperamos
        assertEquals(salarioEsperado, salarioCalculado, "El cálculo del salario no coincide con lo esperado.");
    }
}