package financiero;

public class Cuenta extends ProductoFinanciero{
    private String nombreProducto;
    private String numeroCuenta;

    public Cuenta(String tipoProducto, Double saldo, Double tasaInteres, String nombreProducto, String numeroCuenta) {
        super(tipoProducto, saldo, tasaInteres);
        this.nombreProducto = nombreProducto;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public Double calcularInteres(){
        return super.calcularInteres();
    }

    @Override
    public String infoInteresProductoFinanciero() {
        return "Interes producto - " + nombreProducto + " - " + numeroCuenta + "\n"+
                "Interes: " + this.calcularInteres();


    }
}
