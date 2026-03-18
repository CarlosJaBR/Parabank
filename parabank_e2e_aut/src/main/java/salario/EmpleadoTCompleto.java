package salario;

public class EmpleadoTCompleto extends Empleado{

    private String tipoContrato;
    private Double bono;

    public EmpleadoTCompleto(String nombre, String apellido, int idVendedor, Double salarioBase, String tipoContrato, Double bono) {
        super(nombre, apellido, idVendedor, salarioBase);
        this.tipoContrato = tipoContrato;
        this.bono = bono;
    }
    @Override
    public Double calcularSalario(){
        return super.getSalarioBase()+bono;
    }

}
