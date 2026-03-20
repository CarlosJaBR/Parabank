package accion;

public class LoginAccion extends AccionUsuario{

    public LoginAccion(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public void ejecutar() {
        System.out.println("El usuario " + super.getNombreUsuario() + " ha iniciado sesión");
    }

}

