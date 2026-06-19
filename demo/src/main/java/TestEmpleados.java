public class TestEmpleados {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new EmpleadoTiempoCompleto(
                "Juan",
                "123",
                500000,
                120000
        );

        empleados[1] = new EmpleadoPorHora(
                "Maria",
                "456",
                200000,
                40,
                3000
        );

        empleados[2] = new EmpleadoTiempoCompleto(
                "Carlos",
                "789",
                600000,
                240000
        );

        empleados[3] = new EmpleadoPorHora(
                "Ana",
                "999",
                150000,
                30,
                2500
        );

        System.out.println("=== LISTA DE EMPLEADOS ===");

        for (Empleado e : empleados) {

            System.out.println(e);

            System.out.println("Salario: " +
                    e.calcularSalario());

            System.out.println("-------------------");
        }

        Empleado emp1 = new Empleado(
                "Pedro",
                "111",
                300000
        );

        Empleado emp2 = new Empleado(
                "Lucia",
                "111",
                450000
        );

        System.out.println(
                "emp1 equals emp2: " +
                        emp1.equals(emp2)
        );

        EmpleadoTiempoCompleto etc =
                new EmpleadoTiempoCompleto(
                        "Mario",
                        "222",
                        500000,
                        100000
                );

        EmpleadoPorHora eph =
                new EmpleadoPorHora(
                        "Sofia",
                        "222",
                        200000,
                        20,
                        2000
                );

        System.out.println(
                "TiempoCompleto equals PorHora: "
                        + etc.equals(eph)
        );
    }
}