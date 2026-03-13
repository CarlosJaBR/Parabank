public class Cliente {

    private String nombre;
    private Double totalCompras;

    public Cliente(String nombre, Double totalCompras) {
        this.nombre = nombre;
        this.totalCompras = totalCompras;
    }

    public Double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(Double totalCompras) {
        this.totalCompras = totalCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
