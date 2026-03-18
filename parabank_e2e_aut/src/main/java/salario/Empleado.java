package salario;

public class Empleado {
    private String nombre;
    private String apellido;
    private int idVendedor;
    private Double salarioBase;

    public Empleado(String nombre, String apellido, int idVendedor, Double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idVendedor = idVendedor;
        this.salarioBase = salarioBase;
    }
    public Double calcularSalario(){
        return salarioBase;
    }

    public Double getSalarioBase(){
        return salarioBase;
    }


}
