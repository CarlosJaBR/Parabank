package financiero;

public class ProductoFinanciero {
    private String tipoProducto;
    private Double saldo;
    private Double tasaInteres;

    public ProductoFinanciero(String tipoProducto, Double saldo, Double tasaInteres) {
        this.tipoProducto = tipoProducto;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public Double calcularInteres(){
        return saldo*(tasaInteres/100);
    }

    public String infoInteresProductoFinanciero(){
        return "El interés del producto es: " + this.calcularInteres();

    }

    public String getTipoProducto(){
        return tipoProducto;
    }

}
