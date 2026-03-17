public class Vendedor extends Persona{
    private int idVendedor;

    public Vendedor(String nombre, String apellido, int id, int idVendedor) {
        super(nombre, apellido, id);
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Id vendedor: " + this.idVendedor;
    }
}
