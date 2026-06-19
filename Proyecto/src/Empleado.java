import java.util.Objects;

public class Empleado {

    private String nombre;
    private String dni;
    private double sueldoBase;

    public Empleado(String nombre, String dni, double sueldoBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }

    public final String getDni() {
        return dni;
    }

    public double calcularSalario() {
        return sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado[nombre=" + nombre +
                ", dni=" + dni +
                ", salario=" + calcularSalario() + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Empleado otro = (Empleado) obj;

        return Objects.equals(dni, otro.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}