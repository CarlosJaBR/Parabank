package financiero;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Creación de productos**");
        Cuenta cuentaAhorros = new Cuenta("Cuenta",1000000.0,15.0,"Cuenta Ahorros","11223344");
        System.out.println(cuentaAhorros.infoInteresProductoFinanciero());
        System.out.println("*******");
        Credito creditoLibreInversion = new Credito("Crédito - Libre inversión", 4800000.0,25.0,"CLI001",4);
        System.out.println(creditoLibreInversion.infoInteresProductoFinanciero());
    }
}

