public class Vendedor {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    private double salarioTotal(Double bonificacion){
        return 1500000+bonificacion;
    }

    public void infoSalario(Double bonificacion){
        System.out.println("El salario del vendedor: " + nombre + " es: " + salarioTotal(bonificacion));
    }



}
