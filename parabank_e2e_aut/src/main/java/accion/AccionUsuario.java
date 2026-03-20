package accion;

public abstract class AccionUsuario {
    private String nombreUsuario;

    public AccionUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public abstract void ejecutar();

    public String getNombreUsuario(){
        return nombreUsuario;
    }
}
