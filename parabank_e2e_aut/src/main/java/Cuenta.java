public class Cuenta {
    private String NombreCliente;
    private String correo;
    private String DNI;
    private double monto;
    private int edadCliente;
    private String numeroCuenta;

    public Cuenta(String nombreCliente, String correo, String DNI, double monto, int edadCliente) {
        this.NombreCliente = nombreCliente;
        this.correo = correo;
        this.DNI = DNI;
        this.monto = monto;
        this.edadCliente = edadCliente;
        this.numeroCuenta = "1000000";
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
