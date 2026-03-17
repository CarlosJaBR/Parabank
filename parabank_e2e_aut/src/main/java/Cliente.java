public class Cliente extends Persona{

   private String email;
   private int numCliente;

    public Cliente(String nombre, String apellido, int id,String email,int numCliente) {
        super(nombre, apellido, id);
        this.email = email;
        this.numCliente = numCliente;
    }



}
