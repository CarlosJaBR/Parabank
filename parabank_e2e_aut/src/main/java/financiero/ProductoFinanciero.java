package financiero;

public abstract class ProductoFinanciero {
    private String tipoProducto;
    private Double saldo;
    private Double tasaInteres;

    public ProductoFinanciero(String tipoProducto, Double saldo, Double tasaInteres) {
        this.tipoProducto = tipoProducto;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public abstract Double calcularInteres();

    public abstract String infoInteresProductoFinanciero();

    //Revisar el uso de los getters / protected. Cual es mejor en clases abstracts.
    public String getTipoProducto(){
        return tipoProducto;
    };
    public Double getSaldo(){
      return saldo;
    };
    public Double getTasaInteres(){
        return tasaInteres;
    };

}
