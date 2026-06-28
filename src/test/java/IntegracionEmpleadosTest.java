import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class IntegracionEmpleadosTest {

    @Test
    public void testCircuitoLiquidacionNomina() {
        // 1. DADO (Arrange): Integramos varias partes del sistema
        // Empleado por hora: Sueldo Base 50.000 + (10hs * 2.000) = 70.000
        EmpleadoPorHora empPorHora = new EmpleadoPorHora("Juan", "11122233", 50000.0, 10, 2000.0);
        
        // Empleado tiempo completo: Sueldo Base 100.000 + (Bono anual 120.000 / 12) = 110.000
        EmpleadoTiempoCompleto empCompleto = new EmpleadoTiempoCompleto("Maria", "44455566", 100000.0, 120000.0);
        
        // Los integramos en una lista de la clase Padre (Empleado)
        List<Empleado> nomina = new ArrayList<>();
        nomina.add(empPorHora);
        nomina.add(empCompleto);

        // 2. CUANDO (Act): Ejecutamos el circuito operativo (Liquidación total)
        double totalAPagar = 0;
        for (Empleado emp : nomina) {
            // El polimorfismo hace su magia integrando los distintos métodos calcularSalario()
            totalAPagar += emp.calcularSalario(); 
        }

        // 3. ENTONCES (Assert): Verificamos que la integración funcione en conjunto
        // El total esperado es 70.000 + 110.000 = 180.000
        double totalEsperado = 180000.0;
        assertEquals(totalEsperado, totalAPagar, "El cálculo del circuito de nómina falla al integrar los distintos tipos de empleados");
    }
}