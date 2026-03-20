package accion;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Acciones usuario***");

        LoginAccion login = new LoginAccion("Juanito");
        login.ejecutar();

        CompraAccion compraAccion = new CompraAccion("Fulanito","Arepas",1500.0);
        compraAccion.ejecutar();
    }
}
