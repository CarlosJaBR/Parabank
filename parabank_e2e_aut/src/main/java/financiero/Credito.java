package financiero;

public class Credito extends ProductoFinanciero{
    private String idCredito;
    private int anyosCredito;

    public Credito(String tipoProducto, Double saldo, Double tasaInteres, String idCredito, int anyosCredito) {
        super(tipoProducto, saldo, tasaInteres);
        this.idCredito = idCredito;
        this.anyosCredito = anyosCredito;
    }
    @Override
    public Double calcularInteres(){
        return super.getSaldo()*(super.getTasaInteres()/100)*this.anyosCredito;
    }

    @Override
    public String infoInteresProductoFinanciero() {
        return "Interés producto: " + super.getTipoProducto() + " - " + this.idCredito + "\n"+
        "Interés: " + this.calcularInteres();
    }
}
