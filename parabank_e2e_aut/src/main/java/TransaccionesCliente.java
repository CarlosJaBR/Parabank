public class TransaccionesCliente {
    private String idTransaccion;
    private String tipoTransaccion;
    private String estado;
    private String fecha;
    private String hora;

    public TransaccionesCliente(String idTransaccion, String tipoTransaccion, String estado, String fecha, String hora) {
        this.idTransaccion = idTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void consultaEstadoTransaccion(){
        System.out.println("El estado de la transacción es: " + estado);
    }
}
