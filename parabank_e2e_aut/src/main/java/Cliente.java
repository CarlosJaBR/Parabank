public class Cliente {
    private String numCliente;
    private String correo;
    private String tipoCliente;
    private String telefono;



    @Override
    public String toString() {
        return "Cliente{" +
                "numCliente='" + numCliente + '\'' +
                ", correo='" + correo + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", telefono='" + telefono + '\''+
                '}';
    }
}
