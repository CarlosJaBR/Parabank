package accion;

public class CompraAccion extends AccionUsuario{
    private String producto;
    private Double precio;

    public CompraAccion(String nombreUsuario, String producto, Double precio) {
        super(nombreUsuario);
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    public void ejecutar() {
        System.out.println("El usuario " + super.getNombreUsuario() + " compró " + this.producto + " por precio $" +this.precio);
    }
}
