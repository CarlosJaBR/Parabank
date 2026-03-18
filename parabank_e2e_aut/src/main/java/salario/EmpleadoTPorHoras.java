package salario;

public class EmpleadoTPorHoras extends Empleado{
    private int horasTrabajadas;
    private Double valorHora;

    public EmpleadoTPorHoras(String nombre, String apellido, int idVendedor, int horasTrabajadas, Double valorHora) {
        super(nombre, apellido, idVendedor, 0.0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return valorHora*horasTrabajadas;
    }

}
